package com.magic.data;

public class MapData {

    public static short[][][] LvMap;
    
    public static int[][] initPos = {
            {2, 2},     // 0
            {2, 2},     // 1
            {2, 2},     // 2

    };
    
    public static int[][] finPos = {
            {47,48},     // 0
            {47,48},     // 1
            {47,48},     // 2
 
            {}
    };

    static {
        LvMap = new short[][][]{
                {   
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                	{1,0,24,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,42,0,42,1,1,0,0,0,40,0,0,0,0,0,40,0,0,0,0,0,0,0,40,0,0,0,0,0,40,0,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,42,42,42,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
                	{1,0,0,0,0,40,0,0,0,0,0,0,0,0,40,0,0,42,0,71,42,1,1,0,1,0,0,0,0,0,40,0,0,0,0,40,0,0,0,0,40,0,0,0,0,1,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,40,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,40,1,0,1,45,1},
                	{1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,40,0,1,0,1},
                	{1,40,1,40,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,40,1,40,1,0,0,0,40,0,0,0,40,0,0,1,0,0,1,1,1,1,0,1,0,1},
                	{1,0,1,0,1,1,0,0,0,40,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,40,0,0,0,0,0,0,40,0,0,0,0,0,1,0,0,1,0,1,0,1},
                	{1,0,1,0,1,1,1,1,1,1,1,1,40,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,40,0,1,1,1,1,1,1,1,0,1,0,40,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,45,0,1,0,1,0,0,1,0,40,0,0,1,45,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,0,40,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,40,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,40,1,45,80,75,1,0,1,0,1,40,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,40,1,0,0,1,1,1,1,1,0,1,40,1,0,0,1,0,1,1,1,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,40,1,0,1,0,0,1,23,22,21,1,0,1,0,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,45,0,1,0,1,0,40,1,40,1,0,0,1,0,1},
                	{1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,40,0,0,0,0,0,0,0,0,0,1,1,40,1,40,1,0,40,0,0,0,0,0,0,40,0,0,40,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,40,0,0,0,0,0,0,0,0,1,0,0,1,40,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,40,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,40,1,0,1},
                	{1,0,0,0,0,0,0,0,40,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,40,1,0,0,0,0,1,0,1},
                	{1,76,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,40,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,40,0,1,0,40,0,1,0,40,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,40,1,0,0,0,1,0,0,0,1,0,0,0,40,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,40,0,0,40,0,1,0,0,0,1,0,0,1,40,0,1,0,40,1,1,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,44,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,40,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,40,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,44,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,40,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,43,0,0,0,1,0,1,1,40,1,1,1,0,0,0,1,0,0,40,0,0,1,0,0,0,40,0,1,0,0,1,0,1},
                	{1,0,44,0,0,0,0,0,0,0,1,0,1,0,0,43,0,0,43,0,0,1,40,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,40,1,0,1},
                	{1,0,0,44,0,0,0,0,0,0,1,1,9,0,0,0,43,43,0,0,0,1,0,0,1,0,1,0,40,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,44,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,40,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,43,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,40,0,1,0,0,40,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,40,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,1,1,1,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,45,1},
                	{1,0,0,1,1,1,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,30,44,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,0,40,0,0,0,0,0,0,1},
                	{1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,43,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,12,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,43,0,0,0,0,0,0,0,45,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,45,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,42,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,40,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,44,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,42,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,44,0,0,0,1,0,45,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,42,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,1,0,1,40,1,1,1,1,1,1,1,1,40,1},
                	{1,0,44,0,0,0,0,0,0,0,0,42,0,0,0,0,0,0,0,0,42,0,0,0,0,1,0,0,0,0,45,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,42,0,0,0,0,0,0,1,0,1,0,0,0,0,0,40,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,13,1},
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

                	
                },{
                	//绗�2灞�
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,60,0,60,1,1,12,0,0,54,0,0,0,0,0,54,0,0,0,0,0,0,0,54,0,0,0,0,0,54,0,0,1},
                	{1,0,0,14,1,1,0,0,0,0,0,0,0,0,0,0,0,0,60,60,60,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
                	{1,0,0,0,0,49,0,0,0,0,0,0,0,0,49,0,0,60,0,73,60,1,1,0,1,12,0,0,0,0,54,0,0,0,0,54,0,0,0,0,54,0,0,0,0,1,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,54,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,54,1,0,1,45,1},
                	{1,0,1,0,1,1,0,0,0,49,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,54,0,0,0,0,0,0,54,0,0,0,0,12,1,0,0,1,0,1,0,1},
                	{1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,54,0,1,0,1},
                	{1,49,1,49,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,54,1,54,1,0,0,0,54,0,0,0,54,0,0,1,0,0,1,1,1,1,0,1,0,1},
                	{1,0,1,0,1,1,1,1,1,1,1,1,49,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,54,0,1,1,1,1,1,1,1,0,1,0,54,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,31,45,0,1,0,1,0,0,1,0,54,0,0,1,45,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,0,54,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,49,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,54,1,45,80,75,1,0,1,0,1,54,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,54,1,0,0,1,1,1,1,1,0,1,54,1,0,0,1,0,1,1,1,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,54,1,0,1,0,0,0,54,0,0,0,0,1,0,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,45,0,1,0,1,0,54,1,54,1,0,0,1,0,1},
                	{1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,0,0,49,0,0,0,0,0,0,0,0,0,1,1,54,1,54,1,0,54,0,0,0,0,0,0,54,0,0,54,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,54,0,0,0,0,0,0,0,12,1,0,0,1,54,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,40,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,54,1,0,1},
                	{1,0,0,0,0,0,0,0,49,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,54,1,0,0,0,0,1,0,1},
                	{1,12,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,54,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,54,0,1,0,54,0,1,0,54,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,0,1,0,54,1,0,0,0,1,0,0,0,1,0,0,0,54,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,54,0,0,54,0,1,0,0,0,1,0,0,1,54,0,1,0,54,1,1,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,51,0,0,0,0,0,1,0,0,0,1,12,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,12,0,0,0,0,0,0,1,12,0,0,1,0,0,54,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,54,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,51,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,54,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,1,1,0,0,1,0,0,0,43,0,0,0,1,0,1,1,54,1,1,1,0,0,0,1,0,0,54,0,0,1,0,0,0,54,0,1,0,0,1,0,1},
                	{1,0,51,0,0,0,0,0,0,0,1,0,1,0,0,43,0,0,43,0,0,1,54,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,54,1,0,1},
                	{1,0,0,51,0,0,0,0,0,0,1,1,39,0,0,0,43,43,0,0,0,1,0,0,1,0,1,0,54,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,51,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,54,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,43,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,54,0,1,0,0,54,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,12,0,0,0,0,0,54,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,33,1,0,1},
                	{1,1,1,1,1,1,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,45,1},
                	{1,0,0,1,1,1,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,31,44,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,0,54,0,0,0,0,0,0,1},
                	{1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,43,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,12,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,43,0,0,0,0,0,0,0,45,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,45,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,45,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,40,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,44,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,23,22,21,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,45,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,44,0,0,0,1,0,45,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,42,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,1,0,1,45,1,1,1,1,1,1,1,1,45,1},
                	{1,0,44,0,0,0,0,0,0,0,0,42,0,0,0,0,0,0,0,0,45,0,0,0,0,1,0,0,0,0,45,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,45,0,0,0,0,0,0,1,0,1,0,0,0,0,0,45,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,13,1},
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

               
                },{
                	//绗笁灞�
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                	{1,14,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,66,0,66,1,1,12,0,0,68,0,0,0,0,0,68,0,0,0,0,0,0,0,68,0,0,0,0,0,68,0,12,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,66,66,66,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
                	{1,0,0,0,0,54,0,0,0,0,0,0,0,0,54,0,0,66,0,71,66,1,1,0,1,12,0,0,0,0,68,0,0,0,0,68,0,0,0,0,68,0,0,0,0,1,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,68,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,68,1,0,1,45,1},
                	{1,0,1,0,1,1,0,0,0,54,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,68,0,0,0,0,0,0,68,0,0,0,0,0,1,0,0,1,0,1,0,1},
                	{1,0,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,68,0,1,0,1},
                	{1,54,1,54,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,68,1,68,1,0,0,0,68,0,0,0,68,0,0,1,0,0,1,1,1,1,0,1,0,1},
                	{1,0,1,0,1,1,1,1,1,1,1,1,54,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,68,0,1,1,1,1,1,1,1,0,1,0,68,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,0,0,45,0,1,0,1,0,0,1,0,68,0,0,1,45,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,1,0,0,68,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,54,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,68,1,45,80,75,1,0,1,0,1,68,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,68,1,0,0,1,1,1,1,1,0,1,68,1,0,0,1,0,1,1,1,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,68,1,0,1,0,0,0,68,0,0,0,0,1,0,1,0,0,1,0,1,31,0,1,0,1},
                	{1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,45,0,1,0,1,0,68,1,68,1,0,0,1,0,1},
                	{1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,54,0,0,0,0,0,0,0,0,0,1,1,68,1,68,1,0,68,0,0,0,0,0,0,68,0,0,68,1,0,0,1,0,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,0,0,68,0,0,0,0,0,0,0,0,1,0,0,1,68,1,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,54,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,1,1,68,1,0,1},
                	{1,0,0,0,0,0,0,0,54,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,68,1,0,0,0,0,1,0,1},
                	{1,76,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,1,0,0,0,68,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,68,0,1,0,68,0,1,0,68,0,1,0,0,1,1,1,1,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,0,0,1,0,68,1,0,0,0,1,0,0,0,1,0,0,0,68,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,68,0,0,68,0,1,0,0,0,1,0,0,1,68,0,1,0,68,1,1,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,52,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,68,0,33,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,68,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,52,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,1,0,0,0,68,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,66,0,0,0,1,0,1,1,68,1,1,1,0,0,0,1,0,0,68,0,0,1,0,0,0,68,0,1,0,0,1,0,1},
                	{1,0,52,0,0,0,0,0,0,0,1,0,1,0,0,66,0,0,66,0,0,1,68,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,68,1,0,1},
                	{1,0,0,52,0,0,0,0,0,0,1,1,9,0,0,0,66,66,0,0,0,1,0,0,1,0,1,0,68,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,52,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,68,0,1,0,1},
                	{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,66,0,0,0,0,0,1,0,0,0,0,1,1,1,0,0,0,0,68,0,1,0,0,68,0,0,0,1,0,0,0,0,1,0,1},
                	{1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,12,0,0,0,0,0,68,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,12,1,0,1},
                	{1,0,0,1,1,1,0,52,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,45,1},
                	{1,0,0,1,1,1,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,31,44,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,0,68,0,0,0,0,0,0,1},
                	{1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,43,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,12,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,43,0,0,0,0,0,0,0,45,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,54,0,0,0,0,1,0,0,1,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,50,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,40,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,54,0,0,0,0,0,0,0,1,0,0,0,1,1,1,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,54,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,54,0,0,0,1,0,54,0,0,0,0,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,0,0,1},
                	{1,0,0,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,43,0,0,0,0,0,0,0,0,0,0,1,0,1,54,1,1,1,1,1,1,1,1,54,1},
                	{1,0,44,0,0,0,0,0,0,0,0,50,0,0,0,0,0,0,0,0,50,0,0,0,0,1,0,0,0,0,45,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,54,0,0,0,0,0,0,1,0,1,0,0,0,0,0,45,0,0,0,0,1},
                	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,28,1},
                	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

                }
                
          
        };
    }
}