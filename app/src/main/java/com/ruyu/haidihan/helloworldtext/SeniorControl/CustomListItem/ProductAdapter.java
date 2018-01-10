package com.ruyu.haidihan.helloworldtext.SeniorControl.CustomListItem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ruyu.haidihan.helloworldtext.R;

import java.util.List;

/**
 * Created by haidihan on 2018/1/10.
 * Adapter类似于iOS开发中UITableViewCell源文件，就是给每个Cell赋值的
 */

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    private int resourceId;
    /**
     * Constructor
     *
     * @param context  listView所在的上下文，也就是ListView所在的Activity
     * @param resource Cell的布局资源文件
     * @param objects  Cell上要显示的数据list，也就是实体类集合
     */
    public ProductAdapter(Context context, int resource, List<ProductModel> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    /**
     * @param position 当前设置的Cell行数，类似于iOS开发中的indexPath.row
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        ProductModel product = getItem(position);

        View productView = LayoutInflater.from(getContext()).inflate(resourceId, null);

        TextView productName = (TextView) productView.findViewById(R.id.product_name);
        TextView productStatus = (TextView) productView.findViewById(R.id.product_status);
        TextView productLendMoney = (TextView) productView.findViewById(R.id.product_lend_money);
        TextView productInterest = (TextView) productView.findViewById(R.id.product_interest);
        TextView productEndDate = (TextView) productView.findViewById(R.id.product_date);

        productName.setText(product.productName);
        productStatus.setText(product.productBuyState);
        productLendMoney.setText(product.lendMoney);
        productInterest.setText(product.interest);
        productEndDate.setText(product.endDate);

        return productView;
    }
}

