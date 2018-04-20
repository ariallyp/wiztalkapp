package com.yuanxin.app.app.wsdl.util;

import javax.imageio.ImageIO;

import com.hp.hpl.sparta.xpath.ThisNodeTest;

import net.weedfs.client.AssignParams;
import net.weedfs.client.Assignation;
import net.weedfs.client.Location;
import net.weedfs.client.ReplicationStrategy;
import net.weedfs.client.WeedFSClient;
import net.weedfs.client.WeedFSClientBuilder;
import net.weedfs.client.net.WriteResult;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.List;



/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-4-14 上午11:36
 * <p/>
 * 功能描述： 根据用户昵称生成用户头像
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class FontImageUtil {



    private static final String FONT_IMAGE_BASE_PATH = "D://upload/";
    private static final String FONT_IMAGE_BASE_PATH2 = "/var/lib/jetty/resources/";

	/**
     * 根据文字和图片名称创建图片
     * 默认的字体　宋体加粗
     * @param str　文字
     * @param imgName　文件明
     * @throws Exception
     */
    public static void createImage(String str, String imgName) throws Exception{
        createImage(str,new Font("宋体",Font.BOLD,40),new File(FONT_IMAGE_BASE_PATH+imgName));
    }

    /**
     * 根据str,输出目录创建图片
     * 文字样式默认为　宋体加粗
     * @param str　文字
     * @param outFile　输出目录
     * @throws Exception
     */
    public static void createImage(String str, File outFile) throws Exception{
        createImage(str,new Font("宋体",Font.BOLD,40),outFile);
    }

    /**
     * 根据str,font的样式以及输出文件目录
     * @param str 文字
     * @param font　字体样式
     * @param outFile　输出的文件及其输出的位置
     * @throws Exception
     * createImage("中华人民共和国",new Font("宋体",Font.BOLD,18),new File("e:/a.png"));
     */
    public static void createImage(String str, Font font, File outFile) throws Exception{

        ArrayList<int[]> rgbs = getRGB();
        int width=150;
        int height=150;
        int [] colors=getDeepColor();//采用新算法，固定选定颜色在数组里然后随机。
        //创建图片
        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
        Graphics g=image.getGraphics();
        
        
        
        
        g.setColor(new Color(colors[0],colors[1],colors[2]));//深色
        g.fillRect(0, 0, width, height);//先用深色填充整张图片,也就是背景
        g.setColor(new Color(255,255,255));//在换成浅色 ,改进后统一换成白色
        g.setFont(font);//设置画笔字体

        //画出字符串
        g.drawString(str,33,85);
        g.dispose();
        //输出png图片
        ImageIO.write(image, "png", outFile);
        
        
        
    }


    /**
     *  一个算法　－　判断是深颜色还是浅颜色的算法
     *
     *  $grayLevel = $R * 0.299 + $G * 0.587 + $B * 0.114;
     *    if ($grayLevel >= 192) {
     *      // add shadow
     *    }
     *
     * 已废弃
     */
    private static ArrayList<int[]> getRGB(){
       //1.　随机生成　rgb
       //2.　判断深颜色还是浅颜色
       //3.　继续随机生成　rgb
       //4.　判读是深颜色还是浅颜色　：和第一次相反，返回两个rgb值
       //5.  颜色深的作为背景，颜色浅的作为文字；
       //6.　第一个存放浅颜色，第二个存放深颜色
        ArrayList<int[]> colorList=new ArrayList<int[]>();
        int[] rgb = getRanRGB();
        while (true){
            if(isQianRGB(rgb)){
                colorList.add(rgb);
                break;
            }else {
                rgb=getRanRGB();
            }
        }
        int[] rgbQ=getRanRGB();
        while (true){
            if(isQianRGB(rgbQ)){
                rgbQ=getRanRGB();
            }else {
                colorList.add(rgbQ);
                break;
            }
        }
        return colorList;
    }

    /**
     * 获得随机颜色
     * @return
     */
    private static int[] getRanRGB(){
        int [] colors=new int[3];
        for(int i=0;i<colors.length;i++){
            colors[i]=(int)(Math.random()*256);
        }
        return colors;
    }

    private static int[] getDeepColor(){
    	 Object colors=new int[3];
    	 List colorsList = new ArrayList<>();
    	 int [] colors1 ={188,143,143};
    	 int [] colors2 ={176,23,31}; //红色
    	 int [] colors3 ={227,207,87};
    	 int [] colors4 ={156,102,31};
    	 int [] colors5 ={34,139,34};
    	 int [] colors6 ={3,168,158};
    	 int [] colors7 ={25,25,112};
    	 int [] colors8 ={0,199,140};
    	 int [] colors9 ={255,128,0};
    	 int [] colors10 ={85,102,0};
    	 int [] colors11 ={128,42,42};
    	 int [] colors12 ={199,97,20};
    	 int [] colors13 ={160,32,240};
    	 int [] colors14 ={218,112,214};
    	 int [] colors15 ={138,43,226};
    	 int [] colors16 ={0,0,255};
    	 int [] colors17 ={25,25,112};
    	 int [] colors18 ={64,224,205};
    	 int [] colors19 ={156,102,31};
    	 int [] colors20 ={227,207,87};
    	 
    	 colorsList.add(colors20);
    	 colorsList.add(colors19);
    	 colorsList.add(colors18);
    	 colorsList.add(colors17);
    	 colorsList.add(colors16);
    	 colorsList.add(colors15);
    	 colorsList.add(colors14);
    	 colorsList.add(colors13);
    	 colorsList.add(colors12);
    	 colorsList.add(colors11);
    	 colorsList.add(colors10);
    	 colorsList.add(colors9);
    	 colorsList.add(colors8);
    	 colorsList.add(colors7);
    	 colorsList.add(colors6);
    	 colorsList.add(colors5);
    	 colorsList.add(colors4);
    	 colorsList.add(colors3);
    	 colorsList.add(colors2);
    	 colorsList.add(colors1);
    	 for (int i = 0; i < colorsList.size(); i++) {
    		int j= (int)(Math.random()*colorsList.size());
    		 colors=colorsList.get(j);
		}
    	 return (int[]) colors;
    }
    
    
    /**
     * 判断是不是深颜色
     * @param colors
     * @return
     */
    private static boolean isQianRGB(int[] colors){
        int grayLevel = (int) (colors[0] * 0.299 + colors[1] * 0.587 + colors[2] * 0.114);
        if(grayLevel>=240){
            return true;
        }
        return false;
    }

	public static void main(String[] args) {
		
		String fontString =StringUtil.getCharString("亚平");
        try {
        	for (int i = 0; i < 100; i++) {
        		String imgName = UUID.randomUUID() +".png";
        		FontImageUtil.createImage(fontString,imgName);
        		 System.out.print("red："+(i+1)+"次");  //每次循环打印一次java
			}
			
			/*Map<String, Object> retData = new HashMap<String, Object>();
			InputStream inputStream = new FileInputStream(FONT_IMAGE_BASE_PATH + imgName);
			// 调用服务完成上载
			URL url = new URL("http://192.168.1.22:9333");
			WeedFSClient client = WeedFSClientBuilder.createBuilder().setMasterUrl(url).build();
			Assignation a = client.assign(new AssignParams("", ReplicationStrategy.None));
			Location location = new Location();
			String urllocation = a.location.url;
			System.err.println(urllocation);
			location.url = "192.168.1.22:5083";
			if (urllocation.contains("5083")) {
				a.location.publicUrl="192.168.1.22:5083";
				a.location.url="192.168.1.22:5083";
			}else {
				a.location.publicUrl="192.168.1.22:5084";
				a.location.url="192.168.1.22:5084";
			}
			
			WriteResult rs = client.write(a.weedFSFile, a.location, inputStream, imgName);
			System.err.println(rs.getFid());*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}