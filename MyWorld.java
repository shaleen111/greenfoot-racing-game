import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //public boolean alreadyPlay = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 680, 1, false); 
        GreenfootImage bg = new GreenfootImage("bg.png");
        
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        Car.width = getWidth();
        Car.height = getHeight();
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Rock rock = new Rock();
        addObject(rock,289,395);
        Rock rock2 = new Rock();
        addObject(rock2,351,392);
        Rock rock3 = new Rock();
        addObject(rock3,408,391);
        Rock rock4 = new Rock();
        addObject(rock4,464,391);
        Rock rock5 = new Rock();
        addObject(rock5,526,393);
        Rock rock6 = new Rock();
        addObject(rock6,584,384);
        Rock rock7 = new Rock();
        addObject(rock7,628,350);
        Rock rock8 = new Rock();
        addObject(rock8,658,308);
        Rock rock9 = new Rock();
        addObject(rock9,682,254);
        Rock rock10 = new Rock();
        addObject(rock10,709,207);
        Rock rock11 = new Rock();
        addObject(rock11,753,164);
        Rock rock12 = new Rock();
        addObject(rock12,802,186);
        Rock rock13 = new Rock();
        addObject(rock13,855,187);
        Rock rock14 = new Rock();
        addObject(rock14,893,226);
        Rock rock15 = new Rock();
        addObject(rock15,937,242);
        Rock rock16 = new Rock();
        addObject(rock16,995,280);
        Rock rock17 = new Rock();
        addObject(rock17,794,331);
        Rock rock18 = new Rock();
        addObject(rock18,848,357);
        Rock rock19 = new Rock();
        addObject(rock19,906,389);
        Rock rock20 = new Rock();
        addObject(rock20,1009,432);
        Rock rock21 = new Rock();
        addObject(rock21,1042,479);
        Rock rock22 = new Rock();
        addObject(rock22,1051,543);
        Rock rock23 = new Rock();
        addObject(rock23,1038,600);
        Rock rock24 = new Rock();
        addObject(rock24,671,382);
        Rock rock25 = new Rock();
        addObject(rock25,690,429);
        Rock rock26 = new Rock();
        addObject(rock26,741,457);
        Rock rock27 = new Rock();
        addObject(rock27,793,486);
        Rock rock28 = new Rock();
        addObject(rock28,841,504);
        Rock rock29 = new Rock();
        addObject(rock29,890,522);
        Rock rock30 = new Rock();
        addObject(rock30,266,444);
        Rock rock31 = new Rock();
        addObject(rock31,275,495);
        Rock rock32 = new Rock();
        addObject(rock32,328,513);
        Rock rock33 = new Rock();
        addObject(rock33,379,513);
        Rock rock34 = new Rock();
        addObject(rock34,434,509);
        Rock rock35 = new Rock();
        addObject(rock35,496,513);
        Rock rock36 = new Rock();
        addObject(rock36,551,513);
        Rock rock37 = new Rock();
        addObject(rock37,607,516);
        Rock rock38 = new Rock();
        addObject(rock38,666,519);
        Rock rock39 = new Rock();
        addObject(rock39,727,512);
        Rock rock40 = new Rock();
        addObject(rock40,783,530);
        Rock rock41 = new Rock();
        addObject(rock41,999,646);
        Rock rock42 = new Rock();
        addObject(rock42,936,655);
        Rock rock43 = new Rock();
        addObject(rock43,878,658);
        Rock rock44 = new Rock();
        addObject(rock44,824,662);
        Rock rock45 = new Rock();
        addObject(rock45,763,659);
        Rock rock46 = new Rock();
        addObject(rock46,701,665);
        Rock rock47 = new Rock();
        addObject(rock47,643,662);
        Rock rock48 = new Rock();
        addObject(rock48,580,662);
        Rock rock49 = new Rock();
        addObject(rock49,519,662);
        Rock rock50 = new Rock();
        addObject(rock50,464,664);
        Rock rock51 = new Rock();
        addObject(rock51,399,662);
        Rock rock52 = new Rock();
        addObject(rock52,344,660);
        Rock rock53 = new Rock();
        addObject(rock53,275,664);
        Rock rock54 = new Rock();
        addObject(rock54,218,641);
        Rock rock55 = new Rock();
        addObject(rock55,176,604);
        Rock rock56 = new Rock();
        addObject(rock56,151,558);
        Rock rock57 = new Rock();
        addObject(rock57,133,507);
        Rock rock58 = new Rock();
        addObject(rock58,133,465);
        Rock rock59 = new Rock();
        addObject(rock59,131,417);
        Rock rock60 = new Rock();
        addObject(rock60,144,370);
        Rock rock61 = new Rock();
        addObject(rock61,168,319);
        Rock rock62 = new Rock();
        addObject(rock62,203,277);
        Rock rock63 = new Rock();
        addObject(rock63,246,254);
        Rock rock64 = new Rock();
        addObject(rock64,308,248);
        Rock rock65 = new Rock();
        addObject(rock65,366,244);
        Rock rock66 = new Rock();
        addObject(rock66,416,239);
        Rock rock67 = new Rock();
        addObject(rock67,471,244);
        Rock rock68 = new Rock();
        addObject(rock68,525,243);
        Rock rock69 = new Rock();
        addObject(rock69,560,208);
        Rock rock70 = new Rock();
        addObject(rock70,579,159);
        Rock rock71 = new Rock();
        addObject(rock71,597,116);
        Rock rock72 = new Rock();
        addObject(rock72,636,75);
        Rock rock73 = new Rock();
        addObject(rock73,672,42);
        Rock rock74 = new Rock();
        addObject(rock74,719,21);
        Rock rock75 = new Rock();
        addObject(rock75,778,15);
        Rock rock76 = new Rock();
        addObject(rock76,858,30);
        Rock rock77 = new Rock();
        addObject(rock77,911,59);
        Rock rock78 = new Rock();
        addObject(rock78,954,85);
        Rock rock79 = new Rock();
        addObject(rock79,1004,114);
        Rock rock80 = new Rock();
        addObject(rock80,1055,144);
        Rock rock81 = new Rock();
        addObject(rock81,1105,182);
        Rock rock82 = new Rock();
        addObject(rock82,1124,230);
        Rock rock83 = new Rock();
        addObject(rock83,1131,282);
        Rock rock84 = new Rock();
        addObject(rock84,1127,336);
        Rock rock85 = new Rock();
        addObject(rock85,1096,397);
        Rock rock86 = new Rock();
        addObject(rock86,1064,429);
        Rock rock87 = new Rock();
        addObject(rock87,144,83);
        Rock rock88 = new Rock();
        addObject(rock88,277,154);
        Rock rock89 = new Rock();
        addObject(rock89,338,57);
        Rock rock90 = new Rock();
        addObject(rock90,1159,624);
        Rock rock91 = new Rock();
        addObject(rock91,69,360);
        Rock rock92 = new Rock();
        addObject(rock92,68,587);
        Rock rock93 = new Rock();
        addObject(rock93,1103,63);
        Car car = new Car();
        car.changeControls("up", "left", "right");
        addObject(car,630,601);
        Car car2 = new Car();
        addObject(car2,633,567);
    }

    public void act()
    {
        //if(!alreadyPlay)
        //{
        //    alreadyPlay = true;
        //    GreenfootSound bgS = new GreenfootSound("bg.wav");
        //    bgS.playLoop();
        //}
    }
}
