package com.kush.galgotias;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.gigamole.navigationtabbar.ntb.NavigationTabBar;

import java.util.ArrayList;

/**
 * Created by GIGAMOLE on 28.03.2016.
 */
public class HorizontalNtbActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_ntb);
        initUI();
    }

    private void initUI() {
        final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_horizontal_ntb);
        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 6;
            }

            @Override
            public boolean isViewFromObject(final View view, final Object object) {
                return view.equals(object);
            }

            @Override
            public void destroyItem(final View container, final int position, final Object object) {
                ((ViewPager) container).removeView((View) object);
            }

            @Override
            public Object instantiateItem(final ViewGroup container, final int position) {

                if (position == 0) {
                    final View view = LayoutInflater.from(
                            getBaseContext()).inflate(R.layout.home, null, false);

                    container.addView(view);
                    return view;

                }
                if (position == 1) {
                    final View view = LayoutInflater.from(
                            getBaseContext()).inflate(R.layout.events, null, false);
                    final ImageView iv1 = (ImageView) view.findViewById(R.id.imageView5);
                    iv1.setImageResource(R.drawable.codeicon);
                    final ImageView iv2 = (ImageView) view.findViewById(R.id.imageView6);
                    iv2.setImageResource(R.drawable.robot);

                    final ImageView iv3 = (ImageView) view.findViewById(R.id.imageView7);
                    iv3.setImageResource(R.drawable.gameicon);
                    final ImageView iv4 = (ImageView) view.findViewById(R.id.imageView8);
                    iv4.setImageResource(R.drawable.brain);
                    final ImageView iv5=(ImageView)view.findViewById(R.id.imageView9);
                    iv5.setImageResource(R.drawable.electronicscon);

                    container.addView(view);
                    return view;

                }
                else if (position == 2 || position == 3)
                {
                    final View view = LayoutInflater.from
                            (
                                    getBaseContext()).inflate(R.layout.item_vp, null, false);
                    final TextView txtPage = (TextView) view.findViewById(R.id.txt_vp_item_page);
                    txtPage.setText(String.format("Coming Soon!!!"));


                    container.addView(view);
                    return view;
                }
                else if (position == 4)
                {
                   final View view = LayoutInflater.from
                            (
                                    getBaseContext()).inflate(R.layout.contactus, null, false);



                    container.addView(view);
                    return view;
                }
                else {
                    final View view = LayoutInflater.from
                            (
                                    getBaseContext()).inflate(R.layout.developer, null, false);
                    container.addView(view);
                    return view;
                }

            }
        });

        final String[] colors = getResources().getStringArray(R.array.default_preview);

        final NavigationTabBar navigationTabBar = (NavigationTabBar) findViewById(R.id.ntb_horizontal);
        final ArrayList<NavigationTabBar.Model> models = new ArrayList<>();
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fifth),
                        Color.parseColor(colors[4]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                        .title("Home")
                        .badgeTitle("new")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic),
                        Color.parseColor(colors[0]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_sixth))
                        .title("Events")
                        .badgeTitle("new")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ws),
                        Color.parseColor(colors[1]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_second))
                        .title("Workshops")
                        .badgeTitle("new")

                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_third),
                        Color.parseColor(colors[2]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_seventh))
                        .title("Schedule")
                        .badgeTitle("new")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fourth),
                        Color.parseColor(colors[3]))
                        .selectedIcon(getResources().getDrawable(R.drawable.c))
                        .title("Contact Us")
                        .badgeTitle("new")
                        .build()
        );
        models.add(
                new NavigationTabBar.Model.Builder(
                        getResources().getDrawable(R.drawable.ic_fifth),
                        Color.parseColor(colors[4]))
                        .selectedIcon(getResources().getDrawable(R.drawable.ic_eighth))
                        .title("Developer")
                        .badgeTitle("new")
                        .build()
        );


        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 0);
        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                navigationTabBar.getModels().get(position).hideBadge();
                //if(position==0)
                // {
                //  startActivity(
                //        new Intent(HorizontalNtbActivity.this, MainActivity.class)
                //   );
                //}
            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

        navigationTabBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < navigationTabBar.getModels().size(); i++) {
                    final NavigationTabBar.Model model = navigationTabBar.getModels().get(i);
                    navigationTabBar.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            model.showBadge();
                        }
                    }, i * 100);
                }
            }
        }, 500);
    }
    public void code(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, code.class)
        );
    }
    public void robo(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, robo.class)
        );
    }
    public void frag(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, frag.class)
        );
    }
    public void lingo(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, funn.class)
        );
    }
    public void elec(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, electronics.class)
        );
    }
    public void mech(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, mechanical.class)
        );
    }
    public void art(View v)
    {
        startActivity(
                new Intent(HorizontalNtbActivity.this, arts.class)
        );
    }
}
