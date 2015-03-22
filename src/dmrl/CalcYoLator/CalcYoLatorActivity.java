package dmrl.CalcYoLator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class CalcYoLatorActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView green_num = (TextView) findViewById(R.id.green_num);
//        TextView green_price = (TextView) findViewById(R.id.green_price);
        ImageView green_minus = (ImageView)findViewById(R.id.green_minus_btn);
        green_minus.setOnClickListener(green_minus_listener);
        ImageView green_plus = (ImageView)findViewById(R.id.green_plus_btn);
        green_plus.setOnClickListener(green_plus_listener);
        green_num.setText(Integer.toString(green_plates_num));
        green_double_subtotal = (green_plates_price.multiply(BigDecimal.valueOf(green_plates_num))).doubleValue();
//        green_price.setText(n.format(green_double_subtotal));
        
        TextView blue_num = (TextView) findViewById(R.id.blue_num);
//        TextView blue_price = (TextView) findViewById(R.id.blue_price);
        ImageView blue_minus = (ImageView)findViewById(R.id.blue_minus_btn);
        blue_minus.setOnClickListener(blue_minus_listener);
        ImageView blue_plus = (ImageView)findViewById(R.id.blue_plus_btn);
        blue_plus.setOnClickListener(blue_plus_listener);
        blue_num.setText(Integer.toString(blue_plates_num));
        blue_double_subtotal = (blue_plates_price.multiply(BigDecimal.valueOf(blue_plates_num))).doubleValue();
//        blue_price.setText(n.format(blue_double_subtotal));
        
		TextView purple_num = (TextView) findViewById(R.id.purple_num);
		ImageView purple_minus = (ImageView)findViewById(R.id.purple_minus_btn);
		purple_minus.setOnClickListener(purple_minus_listener);
		ImageView purple_plus = (ImageView)findViewById(R.id.purple_plus_btn);
		purple_plus.setOnClickListener(purple_plus_listener);
		purple_num.setText(Integer.toString(purple_plates_num));
		purple_double_subtotal = (purple_plates_price.multiply(BigDecimal.valueOf(purple_plates_num))).doubleValue();
		
		TextView orange_num = (TextView) findViewById(R.id.orange_num);
		ImageView orange_minus = (ImageView)findViewById(R.id.orange_minus_btn);
		orange_minus.setOnClickListener(orange_minus_listener);
		ImageView orange_plus = (ImageView)findViewById(R.id.orange_plus_btn);
		orange_plus.setOnClickListener(orange_plus_listener);
		orange_num.setText(Integer.toString(orange_plates_num));
		orange_double_subtotal = (orange_plates_price.multiply(BigDecimal.valueOf(orange_plates_num))).doubleValue();
		
		TextView pink_num = (TextView) findViewById(R.id.pink_num);
		ImageView pink_minus = (ImageView)findViewById(R.id.pink_minus_btn);
		pink_minus.setOnClickListener(pink_minus_listener);
		ImageView pink_plus = (ImageView)findViewById(R.id.pink_plus_btn);
		pink_plus.setOnClickListener(pink_plus_listener);
		pink_num.setText(Integer.toString(pink_plates_num));
		pink_double_subtotal = (pink_plates_price.multiply(BigDecimal.valueOf(pink_plates_num))).doubleValue();
		
		TextView red_num = (TextView) findViewById(R.id.red_num);
		ImageView red_minus = (ImageView)findViewById(R.id.red_minus_btn);
		red_minus.setOnClickListener(red_minus_listener);
		ImageView red_plus = (ImageView)findViewById(R.id.red_plus_btn);
		red_plus.setOnClickListener(red_plus_listener);
		red_num.setText(Integer.toString(red_plates_num));
		red_double_subtotal = (red_plates_price.multiply(BigDecimal.valueOf(red_plates_num))).doubleValue();
		
		TextView grey_num = (TextView) findViewById(R.id.grey_num);
		ImageView grey_minus = (ImageView)findViewById(R.id.grey_minus_btn);
		grey_minus.setOnClickListener(grey_minus_listener);
		ImageView grey_plus = (ImageView)findViewById(R.id.grey_plus_btn);
		grey_plus.setOnClickListener(grey_plus_listener);
		grey_num.setText(Integer.toString(grey_plates_num));
		grey_double_subtotal = (grey_plates_price.multiply(BigDecimal.valueOf(grey_plates_num))).doubleValue();

        TextView grand_total = (TextView) findViewById(R.id.grand_total);
        grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal));
    }
    
    int green_plates_num = 0;
    BigDecimal green_plates_price = new BigDecimal("1.7");
    double green_double_subtotal = 0;
    
    int blue_plates_num = 0;
    BigDecimal blue_plates_price = new BigDecimal("2.3");
    double blue_double_subtotal = 0;

    int purple_plates_num = 0;
    BigDecimal purple_plates_price = new BigDecimal("2.9");
    double purple_double_subtotal = 0;

    int orange_plates_num = 0;
    BigDecimal orange_plates_price = new BigDecimal("3.4");
    double orange_double_subtotal = 0;

    int pink_plates_num = 0;
    BigDecimal pink_plates_price = new BigDecimal("3.9");
    double pink_double_subtotal = 0;

    int red_plates_num = 0;
    BigDecimal red_plates_price = new BigDecimal("4.3");
    double red_double_subtotal = 0;

    int grey_plates_num = 0;
    BigDecimal grey_plates_price = new BigDecimal("5");
    double grey_double_subtotal = 0;
    
    NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK);
    
    private OnClickListener green_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView green_num = (TextView) findViewById(R.id.green_num);
//            TextView green_price = (TextView) findViewById(R.id.green_price);
            
            if (green_plates_num != 0)
            	green_plates_num--;
        	
            green_num.setText(Integer.toString(green_plates_num));
            green_double_subtotal = (green_plates_price.multiply(BigDecimal.valueOf(green_plates_num))).doubleValue();
//            green_price.setText(n.format(green_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener blue_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView blue_num = (TextView) findViewById(R.id.blue_num);
//            TextView blue_price = (TextView) findViewById(R.id.blue_price);
            
            if (blue_plates_num != 0)
            	blue_plates_num--;
        	
            blue_num.setText(Integer.toString(blue_plates_num));
            blue_double_subtotal = (blue_plates_price.multiply(BigDecimal.valueOf(blue_plates_num))).doubleValue();
//            blue_price.setText(n.format(blue_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener purple_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView purple_num = (TextView) findViewById(R.id.purple_num);
//            TextView purple_price = (TextView) findViewById(R.id.purple_price);
            
            if (purple_plates_num != 0)
            	purple_plates_num--;
        	
            purple_num.setText(Integer.toString(purple_plates_num));
            purple_double_subtotal = (purple_plates_price.multiply(BigDecimal.valueOf(purple_plates_num))).doubleValue();
//            purple_price.setText(n.format(purple_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener orange_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView orange_num = (TextView) findViewById(R.id.orange_num);
//            TextView orange_price = (TextView) findViewById(R.id.orange_price);
            
            if (orange_plates_num != 0)
            	orange_plates_num--;
        	
            orange_num.setText(Integer.toString(orange_plates_num));
            orange_double_subtotal = (orange_plates_price.multiply(BigDecimal.valueOf(orange_plates_num))).doubleValue();
//            orange_price.setText(n.format(orange_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener pink_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView pink_num = (TextView) findViewById(R.id.pink_num);
//            TextView pink_price = (TextView) findViewById(R.id.pink_price);
            
            if (pink_plates_num != 0)
            	pink_plates_num--;
        	
            pink_num.setText(Integer.toString(pink_plates_num));
            pink_double_subtotal = (pink_plates_price.multiply(BigDecimal.valueOf(pink_plates_num))).doubleValue();
//            pink_price.setText(n.format(pink_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener red_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView red_num = (TextView) findViewById(R.id.red_num);
//            TextView red_price = (TextView) findViewById(R.id.red_price);
            
            if (red_plates_num != 0)
            	red_plates_num--;
        	
            red_num.setText(Integer.toString(red_plates_num));
            red_double_subtotal = (red_plates_price.multiply(BigDecimal.valueOf(red_plates_num))).doubleValue();
//            red_price.setText(n.format(red_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener grey_minus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView grey_num = (TextView) findViewById(R.id.grey_num);
//            TextView grey_price = (TextView) findViewById(R.id.grey_price);
            
            if (grey_plates_num != 0)
            	grey_plates_num--;
        	
            grey_num.setText(Integer.toString(grey_plates_num));
            grey_double_subtotal = (grey_plates_price.multiply(BigDecimal.valueOf(grey_plates_num))).doubleValue();
//            grey_price.setText(n.format(grey_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener green_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView green_num = (TextView) findViewById(R.id.green_num);
//            TextView green_price = (TextView) findViewById(R.id.green_price);
            
            if (green_plates_num != Integer.MAX_VALUE)
            	green_plates_num++;
        	
            green_num.setText(Integer.toString(green_plates_num));
            green_double_subtotal = (green_plates_price.multiply(BigDecimal.valueOf(green_plates_num))).doubleValue();
//            green_price.setText(n.format(green_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener blue_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView blue_num = (TextView) findViewById(R.id.blue_num);
//            TextView blue_price = (TextView) findViewById(R.id.blue_price);
            
            if (blue_plates_num != Integer.MAX_VALUE)
            	blue_plates_num++;
        	
            blue_num.setText(Integer.toString(blue_plates_num));
            blue_double_subtotal = (blue_plates_price.multiply(BigDecimal.valueOf(blue_plates_num))).doubleValue();
//            blue_price.setText(n.format(blue_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener purple_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView purple_num = (TextView) findViewById(R.id.purple_num);
//            TextView purple_price = (TextView) findViewById(R.id.purple_price);
            
            if (purple_plates_num != Integer.MAX_VALUE)
            	purple_plates_num++;
        	
            purple_num.setText(Integer.toString(purple_plates_num));
            purple_double_subtotal = (purple_plates_price.multiply(BigDecimal.valueOf(purple_plates_num))).doubleValue();
//            purple_price.setText(n.format(purple_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener orange_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView orange_num = (TextView) findViewById(R.id.orange_num);
//            TextView orange_price = (TextView) findViewById(R.id.orange_price);
            
            if (orange_plates_num != Integer.MAX_VALUE)
            	orange_plates_num++;
        	
            orange_num.setText(Integer.toString(orange_plates_num));
            orange_double_subtotal = (orange_plates_price.multiply(BigDecimal.valueOf(orange_plates_num))).doubleValue();
//            orange_price.setText(n.format(orange_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener pink_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView pink_num = (TextView) findViewById(R.id.pink_num);
//            TextView pink_price = (TextView) findViewById(R.id.pink_price);
            
            if (pink_plates_num != Integer.MAX_VALUE)
            	pink_plates_num++;
        	
            pink_num.setText(Integer.toString(pink_plates_num));
            pink_double_subtotal = (pink_plates_price.multiply(BigDecimal.valueOf(pink_plates_num))).doubleValue();
//            pink_price.setText(n.format(pink_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener red_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView red_num = (TextView) findViewById(R.id.red_num);
//            TextView red_price = (TextView) findViewById(R.id.red_price);
            
            if (red_plates_num != Integer.MAX_VALUE)
            	red_plates_num++;
        	
            red_num.setText(Integer.toString(red_plates_num));
            red_double_subtotal = (red_plates_price.multiply(BigDecimal.valueOf(red_plates_num))).doubleValue();
//            red_price.setText(n.format(red_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    private OnClickListener grey_plus_listener = new OnClickListener() {
        public void onClick(View v) {
        	
        	TextView grey_num = (TextView) findViewById(R.id.grey_num);
//            TextView grey_price = (TextView) findViewById(R.id.grey_price);
            
            if (grey_plates_num != Integer.MAX_VALUE)
            	grey_plates_num++;
        	
            grey_num.setText(Integer.toString(grey_plates_num));
            grey_double_subtotal = (grey_plates_price.multiply(BigDecimal.valueOf(grey_plates_num))).doubleValue();
//            grey_price.setText(n.format(grey_double_subtotal));
            
            TextView grand_total = (TextView) findViewById(R.id.grand_total);
            grand_total.setText(n.format(green_double_subtotal+blue_double_subtotal+purple_double_subtotal+orange_double_subtotal+pink_double_subtotal+red_double_subtotal+grey_double_subtotal));
        }
    };
    
    
    
}