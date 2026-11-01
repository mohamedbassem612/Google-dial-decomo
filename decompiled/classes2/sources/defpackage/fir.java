package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fir implements defpackage.fip, defpackage.ewm {
    public static final aify a = aify.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final aify b = aify.t(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final aify c = aify.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final aify d = aify.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final aify e = aify.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final aify f = aify.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    private static defpackage.fir h;
    public final defpackage.oq g;
    private final android.content.Context i;
    private final aigf j;
    private final defpackage.fja k;
    private int l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private int s;
    private java.lang.String t;

    public fir(android.content.Context context, java.util.Map map) {
        boolean z;
        this.i = context == null ? null : context.getApplicationContext();
        this.j = aigf.i(map);
        this.g = new defpackage.oq((char[]) null, (byte[]) null);
        this.k = new defpackage.fja();
        if (context == null) {
            this.s = 0;
            this.q = 1000000L;
            return;
        }
        afpb afpbVarI = afpb.i(context);
        int iF = afpbVarI.f();
        this.s = iF;
        this.q = i(iF);
        rai raiVar = new rai(this);
        java.util.concurrent.Executor executorAD = defpackage.hgu.aD();
        afpbVarI.g();
        defpackage.ett ettVar = new defpackage.ett(afpbVarI, raiVar, executorAD);
        synchronized (afpbVarI.d) {
            ((java.util.concurrent.CopyOnWriteArrayList) afpbVarI.a).add(ettVar);
            z = afpbVarI.c;
        }
        if (z) {
            ettVar.a();
        }
    }

    public static synchronized defpackage.fir f(android.content.Context context) {
        defpackage.fir firVar;
        firVar = h;
        if (firVar == null) {
            android.content.Context applicationContext = context == null ? null : context.getApplicationContext();
            java.util.HashMap map = new java.util.HashMap(8);
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
            defpackage.fir firVar2 = new defpackage.fir(applicationContext, map);
            h = firVar2;
            firVar = firVar2;
        }
        return firVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:866:0x0a54 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:875:0x0a75 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:881:0x0a8d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:884:0x0a99 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:887:0x0aa5 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:893:0x0abd A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 13, list:
      (r0v0 int) from 0x0006: IF  (r0v0 int) != (2091 int)  -> B:4:0x0008 A[HIDDEN] (LINE:7)
      (r0v0 int) from 0x000a: IF  (r0v0 int) != (2092 int)  -> B:6:0x000c A[HIDDEN] (LINE:11)
      (r0v0 int) from 0x000e: IF  (r0v0 int) != (2102 int)  -> B:8:0x0010 A[HIDDEN] (LINE:15)
      (r0v0 int) from 0x0012: IF  (r0v0 int) != (2103 int)  -> B:10:0x0014 A[HIDDEN] (LINE:19)
      (r0v0 int) from 0x0016: IF  (r0v0 int) != (2111 int)  -> B:12:0x0018 A[HIDDEN] (LINE:23)
      (r0v0 int) from 0x001a: IF  (r0v0 int) != (2112 int)  -> B:14:0x001c A[HIDDEN] (LINE:27)
      (r0v0 int) from 0x001e: IF  (r0v0 int) != (2135 int)  -> B:16:0x0020 A[HIDDEN] (LINE:31)
      (r0v0 int) from 0x0022: IF  (r0v0 int) != (2136 int)  -> B:18:0x0024 A[HIDDEN] (LINE:35)
      (r0v0 int) from 0x0027: SWITCH (r0v0 int)
     case 2088: goto B:857:0x0a37
     case 2094: goto B:853:0x0a2b
     case 2105: goto B:849:0x0a1f
     case 2114: goto B:845:0x0a13
     case 2115: goto B:841:0x0a07
     case 2116: goto B:837:0x09fb
     case 2117: goto B:833:0x09ef
     case 2118: goto B:829:0x09e3
     case 2119: goto B:825:0x09d7
     case 2120: goto B:821:0x09cb
     case 2133: goto B:817:0x09bf
     case 2142: goto B:813:0x09b3
     case 2145: goto B:809:0x09a7
     case 2152: goto B:806:0x099d
     case 2153: goto B:802:0x0991
     case 2154: goto B:798:0x0985
     case 2155: goto B:794:0x0979
     case 2156: goto B:790:0x096d
     case 2159: goto B:786:0x0961
     case 2162: goto B:782:0x0955
     case 2163: goto B:778:0x0949
     case 2164: goto B:775:0x093f
     case 2165: goto B:772:0x0935
     case 2166: goto B:768:0x0929
     case 2167: goto B:764:0x091d
     case 2177: goto B:760:0x0911
     case 2182: goto B:757:0x0907
     case 2183: goto B:753:0x08fb
     case 2185: goto B:750:0x08f1
     case 2187: goto B:746:0x08e5
     case 2198: goto B:742:0x08d9
     case 2206: goto B:738:0x08cd
     case 2208: goto B:734:0x08c2
     case 2210: goto B:730:0x08b6
     case 2221: goto B:726:0x08aa
     case 2222: goto B:722:0x089f
     case 2223: goto B:718:0x0893
     case 2243: goto B:714:0x0887
     case 2244: goto B:710:0x087b
     case 2245: goto B:706:0x086f
     case 2247: goto B:702:0x0863
     case 2249: goto B:698:0x0857
     case 2252: goto B:694:0x084b
     case 2266: goto B:690:0x083f
     case 2267: goto B:686:0x0833
     case 2269: goto B:682:0x0827
     case 2270: goto B:678:0x081b
     case 2271: goto B:674:0x080f
     case 2272: goto B:670:0x0803
     case 2273: goto B:666:0x07f7
     case 2274: goto B:662:0x07eb
     case 2277: goto B:658:0x07df
     case 2278: goto B:654:0x07d3
     case 2279: goto B:650:0x07c7
     case 2281: goto B:646:0x07bb
     case 2282: goto B:643:0x07b1
     case 2283: goto B:639:0x07a5
     case 2285: goto B:635:0x0799
     case 2286: goto B:631:0x078d
     case 2288: goto B:627:0x0781
     case 2290: goto B:623:0x0775
     case 2307: goto B:619:0x076a
     case 2314: goto B:615:0x075e
     case 2316: goto B:612:0x0754
     case 2317: goto B:609:0x074a
     case 2331: goto B:605:0x073e
     case 2332: goto B:601:0x0732
     case 2339: goto B:597:0x0726
     case 2340: goto B:594:0x071c
     case 2341: goto B:590:0x0710
     case 2342: goto B:586:0x0704
     case 2344: goto B:582:0x06f8
     case 2345: goto B:578:0x06ec
     case 2346: goto B:575:0x06e2
     case 2347: goto B:571:0x06d6
     case 2363: goto B:568:0x06cc
     case 2371: goto B:564:0x06c0
     case 2373: goto B:561:0x06b6
     case 2374: goto B:557:0x06aa
     case 2394: goto B:553:0x069e
     case 2396: goto B:549:0x0692
     case 2397: goto B:545:0x0686
     case 2398: goto B:542:0x067c
     case 2402: goto B:538:0x0670
     case 2403: goto B:535:0x0666
     case 2407: goto B:531:0x065a
     case 2412: goto B:528:0x0650
     case 2414: goto B:525:0x0646
     case 2415: goto B:521:0x063a
     case 2421: goto B:517:0x062e
     case 2422: goto B:513:0x0622
     case 2423: goto B:509:0x0616
     case 2429: goto B:506:0x060c
     case 2431: goto B:502:0x0600
     case 2438: goto B:499:0x05f6
     case 2439: goto B:495:0x05ea
     case 2440: goto B:491:0x05de
     case 2441: goto B:487:0x05d2
     case 2442: goto B:484:0x05c8
     case 2445: goto B:481:0x05be
     case 2452: goto B:477:0x05b2
     case 2454: goto B:474:0x05a8
     case 2455: goto B:470:0x059c
     case 2456: goto B:466:0x0590
     case 2457: goto B:462:0x0584
     case 2458: goto B:459:0x057a
     case 2459: goto B:455:0x056e
     case 2462: goto B:451:0x0562
     case 2463: goto B:448:0x0558
     case 2464: goto B:445:0x054e
     case 2465: goto B:441:0x0542
     case 2466: goto B:437:0x0536
     case 2467: goto B:433:0x052a
     case 2468: goto B:429:0x051e
     case 2469: goto B:426:0x0514
     case 2470: goto B:423:0x050a
     case 2471: goto B:420:0x0500
     case 2472: goto B:416:0x04f4
     case 2473: goto B:412:0x04e8
     case 2474: goto B:408:0x04dc
     case 2475: goto B:404:0x04d0
     case 2476: goto B:400:0x04c5
     case 2477: goto B:396:0x04b9
     case 2483: goto B:392:0x04ad
     case 2485: goto B:388:0x04a1
     case 2487: goto B:385:0x0497
     case 2488: goto B:382:0x048d
     case 2489: goto B:378:0x0481
     case 2491: goto B:375:0x0477
     case 2494: goto B:371:0x046b
     case 2497: goto B:367:0x045f
     case 2498: goto B:363:0x0453
     case 2500: goto B:360:0x0449
     case 2503: goto B:357:0x043f
     case 2508: goto B:353:0x0433
     case 2526: goto B:349:0x0427
     case 2545: goto B:346:0x041d
     case 2549: goto B:342:0x0411
     case 2550: goto B:338:0x0405
     case 2551: goto B:335:0x03fb
     case 2552: goto B:331:0x03ef
     case 2555: goto B:327:0x03e3
     case 2556: goto B:323:0x03d7
     case 2557: goto B:320:0x03cd
     case 2562: goto B:316:0x03c2
     case 2563: goto B:312:0x03b6
     case 2564: goto B:309:0x03ac
     case 2567: goto B:305:0x03a0
     case 2569: goto B:302:0x0396
     case 2576: goto B:298:0x038a
     case 2611: goto B:294:0x037e
     case 2621: goto B:290:0x0372
     case 2625: goto B:286:0x0366
     case 2627: goto B:282:0x035a
     case 2629: goto B:278:0x034e
     case 2638: goto B:274:0x0343
     case 2639: goto B:270:0x0337
     case 2640: goto B:267:0x032d
     case 2641: goto B:264:0x0323
     case 2642: goto B:261:0x0319
     case 2644: goto B:257:0x030d
     case 2645: goto B:254:0x0303
     case 2646: goto B:251:0x02f9
     case 2647: goto B:248:0x02ef
     case 2648: goto B:244:0x02e3
     case 2649: goto B:241:0x02d9
     case 2650: goto B:238:0x02cf
     case 2651: goto B:234:0x02c3
     case 2652: goto B:230:0x02b7
     case 2655: goto B:226:0x02ab
     case 2656: goto B:223:0x02a1
     case 2657: goto B:219:0x0295
     case 2659: goto B:215:0x0289
     case 2661: goto B:212:0x027f
     case 2662: goto B:209:0x0275
     case 2663: goto B:206:0x026b
     case 2671: goto B:202:0x025f
     case 2672: goto B:199:0x0255
     case 2675: goto B:195:0x0249
     case 2676: goto B:192:0x023f
     case 2678: goto B:189:0x0235
     case 2680: goto B:186:0x022b
     case 2681: goto B:183:0x0221
     case 2682: goto B:179:0x0215
     case 2683: goto B:175:0x0209
     case 2686: goto B:172:0x01ff
     case 2688: goto B:168:0x01f3
     case 2690: goto B:165:0x01e9
     case 2691: goto B:161:0x01df
     case 2694: goto B:157:0x01d3
     case 2700: goto B:154:0x01c9
     case 2706: goto B:150:0x01bd
     case 2718: goto B:146:0x01b1
     case 2724: goto B:142:0x01a5
     case 2725: goto B:138:0x0199
     case 2731: goto B:135:0x018f
     case 2733: goto B:132:0x0185
     case 2735: goto B:129:0x017b
     case 2737: goto B:125:0x016f
     case 2739: goto B:121:0x0163
     case 2744: goto B:117:0x0157
     case 2751: goto B:114:0x014d
     case 2767: goto B:111:0x0143
     case 2780: goto B:108:0x0139
     case 2803: goto B:104:0x012d
     case 2828: goto B:101:0x0123
     case 2843: goto B:98:0x0119
     case 2855: goto B:94:0x010d
     case 2867: goto B:90:0x0101
     case 2877: goto B:87:0x00f7
     default: goto B:20:0x002a A[RegionRef:SW:19] (LINE:40)
      (r0v0 int) from 0x002a: SWITCH (r0v0 int)
     case 2096: goto B:84:0x00ed
     case 2097: goto B:80:0x00e1
     case 2098: goto B:76:0x00d5
     case 2099: goto B:73:0x00cb
     case 2100: goto B:69:0x00c0
     default: goto B:21:0x002d A[RegionRef:SW:20] (LINE:43)
      (r0v0 int) from 0x002d: SWITCH (r0v0 int)
     case 2122: goto B:66:0x00b6
     case 2123: goto B:62:0x00aa
     case 2124: goto B:58:0x009e
     case 2125: goto B:54:0x0092
     default: goto B:22:0x0030 A[RegionRef:SW:21] (LINE:46)
      (r0v0 int) from 0x0030: SWITCH (r0v0 int)
     case 2127: goto B:51:0x0088
     case 2128: goto B:47:0x007c
     case 2129: goto B:43:0x0070
     case 2130: goto B:39:0x0064
     default: goto B:23:0x0033 A[RegionRef:SW:22] (LINE:49)
      (r0v0 int) from 0x0033: SWITCH (r0v0 int)
     case 2147: goto B:35:0x0058
     case 2148: goto B:32:0x004e
     case 2149: goto B:28:0x0042
     case 2150: goto B:25:0x0038
     default: goto B:897:0x0acd A[RegionRef:SW:23] (LINE:52)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int h(java.lang.String str) {
        if (iHashCode != 2091) {
            if (iHashCode != 2092) {
                if (iHashCode != 2102) {
                    if (iHashCode != 2103) {
                        if (iHashCode != 2111) {
                            if (iHashCode != 2112) {
                                if (iHashCode != 2135) {
                                    if (iHashCode != 2136) {
                                        switch (str) {
                                            case "AD":
                                                return 73745;
                                            case "AE":
                                                return 50849;
                                            case "AF":
                                                return 76004;
                                            case "AG":
                                                return 76002;
                                            default:
                                                switch (str) {
                                                    case 2088:
                                                        if (str.equals("AI")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2094:
                                                        if (str.equals("AO")) {
                                                            return 75555;
                                                        }
                                                        break;
                                                    case 2105:
                                                        if (str.equals("AZ")) {
                                                            return 75476;
                                                        }
                                                        break;
                                                    case 2114:
                                                        if (str.equals("BD")) {
                                                            return 83146;
                                                        }
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            return 69696;
                                                        }
                                                        break;
                                                    case 2116:
                                                        if (str.equals("BF")) {
                                                            return 76060;
                                                        }
                                                        break;
                                                    case 2117:
                                                        if (str.equals("BG")) {
                                                            return 69632;
                                                        }
                                                        break;
                                                    case 2118:
                                                        if (str.equals("BH")) {
                                                            return 83545;
                                                        }
                                                        break;
                                                    case 2119:
                                                        if (str.equals("BI")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            return 75428;
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (str.equals("BW")) {
                                                            return 73811;
                                                        }
                                                        break;
                                                    case 2142:
                                                        if (str.equals("CA")) {
                                                            return 111696;
                                                        }
                                                        break;
                                                    case 2145:
                                                        if (str.equals("CD")) {
                                                            return 74907;
                                                        }
                                                        break;
                                                    case 2152:
                                                        if (str.equals("CK")) {
                                                            return 74386;
                                                        }
                                                        break;
                                                    case 2153:
                                                        if (str.equals("CL")) {
                                                            return 74888;
                                                        }
                                                        break;
                                                    case 2154:
                                                        if (str.equals("CM")) {
                                                            return 75996;
                                                        }
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            return 45634;
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            return 74970;
                                                        }
                                                        break;
                                                    case 2159:
                                                        if (str.equals("CR")) {
                                                            return 76066;
                                                        }
                                                        break;
                                                    case 2162:
                                                        if (str.equals("CU")) {
                                                            return 76052;
                                                        }
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            return 74266;
                                                        }
                                                        break;
                                                    case 2164:
                                                        if (str.equals("CW")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2165:
                                                        if (str.equals("CX")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2166:
                                                        if (str.equals("CY")) {
                                                            return 65601;
                                                        }
                                                        break;
                                                    case 2167:
                                                        if (str.equals("CZ")) {
                                                            return 69760;
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            return 42248;
                                                        }
                                                        break;
                                                    case 2182:
                                                        if (str.equals("DJ")) {
                                                            return 75476;
                                                        }
                                                        break;
                                                    case 2183:
                                                        if (str.equals("DK")) {
                                                            return 65664;
                                                        }
                                                        break;
                                                    case 2185:
                                                        if (str.equals("DM")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2187:
                                                        if (str.equals("DO")) {
                                                            return 76067;
                                                        }
                                                        break;
                                                    case 2198:
                                                        if (str.equals("DZ")) {
                                                            return 76059;
                                                        }
                                                        break;
                                                    case 2206:
                                                        if (str.equals("EC")) {
                                                            return 74393;
                                                        }
                                                        break;
                                                    case 2208:
                                                        if (str.equals("EE")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2210:
                                                        if (str.equals("EG")) {
                                                            return 75491;
                                                        }
                                                        break;
                                                    case 2221:
                                                        if (str.equals("ER")) {
                                                            return 74900;
                                                        }
                                                        break;
                                                    case 2222:
                                                        if (str.equals("ES")) {
                                                            return 4096;
                                                        }
                                                        break;
                                                    case 2223:
                                                        if (str.equals("ET")) {
                                                            return 84252;
                                                        }
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            return 66048;
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            return 75411;
                                                        }
                                                        break;
                                                    case 2245:
                                                        if (str.equals("FK")) {
                                                            return 74899;
                                                        }
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            return 74004;
                                                        }
                                                        break;
                                                    case 2249:
                                                        if (str.equals("FO")) {
                                                            return 73872;
                                                        }
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            return 66121;
                                                        }
                                                        break;
                                                    case 2266:
                                                        if (str.equals("GA")) {
                                                            return 73763;
                                                        }
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            return 74953;
                                                        }
                                                        break;
                                                    case 2269:
                                                        if (str.equals("GD")) {
                                                            return 73746;
                                                        }
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            return 74761;
                                                        }
                                                        break;
                                                    case 2271:
                                                        if (str.equals("GF")) {
                                                            return 75475;
                                                        }
                                                        break;
                                                    case 2272:
                                                        if (str.equals("GG")) {
                                                            return 74320;
                                                        }
                                                        break;
                                                    case 2273:
                                                        if (str.equals("GH")) {
                                                            return 74971;
                                                        }
                                                        break;
                                                    case 2274:
                                                        if (str.equals("GI")) {
                                                            return 74256;
                                                        }
                                                        break;
                                                    case 2277:
                                                        if (str.equals("GL")) {
                                                            return 73873;
                                                        }
                                                        break;
                                                    case 2278:
                                                        if (str.equals("GM")) {
                                                            return 75932;
                                                        }
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            return 75043;
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (str.equals("GP")) {
                                                            return 75338;
                                                        }
                                                        break;
                                                    case 2282:
                                                        if (str.equals("GQ")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2283:
                                                        if (str.equals("GR")) {
                                                            return 69633;
                                                        }
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            return 74378;
                                                        }
                                                        break;
                                                    case 2286:
                                                        if (str.equals("GU")) {
                                                            return 79634;
                                                        }
                                                        break;
                                                    case 2288:
                                                        if (str.equals("GW")) {
                                                            return 74852;
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (str.equals("GY")) {
                                                            return 75339;
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            return 4616;
                                                        }
                                                        break;
                                                    case 2314:
                                                        if (str.equals("HR")) {
                                                            return 65537;
                                                        }
                                                        break;
                                                    case 2316:
                                                        if (str.equals("HT")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2317:
                                                        if (str.equals("HU")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            return 141003;
                                                        }
                                                        break;
                                                    case 2332:
                                                        if (str.equals("IE")) {
                                                            return 70217;
                                                        }
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            return 83601;
                                                        }
                                                        break;
                                                    case 2340:
                                                        if (str.equals("IM")) {
                                                            return 74256;
                                                        }
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            return 107721;
                                                        }
                                                        break;
                                                    case 2342:
                                                        if (str.equals("IO")) {
                                                            return 73875;
                                                        }
                                                        break;
                                                    case 2344:
                                                        if (str.equals("IQ")) {
                                                            return 74963;
                                                        }
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            return 116436;
                                                        }
                                                        break;
                                                    case 2346:
                                                        if (str.equals("IS")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            return 70728;
                                                        }
                                                        break;
                                                    case 2363:
                                                        if (str.equals("JE")) {
                                                            return 74256;
                                                        }
                                                        break;
                                                    case 2371:
                                                        if (str.equals("JM")) {
                                                            return 74466;
                                                        }
                                                        break;
                                                    case 2373:
                                                        if (str.equals("JO")) {
                                                            return 74313;
                                                        }
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            return 83608;
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            return 70227;
                                                        }
                                                        break;
                                                    case 2396:
                                                        if (str.equals("KG")) {
                                                            return 74826;
                                                        }
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            return 75009;
                                                        }
                                                        break;
                                                    case 2398:
                                                        if (str.equals("KI")) {
                                                            return 76052;
                                                        }
                                                        break;
                                                    case 2402:
                                                        if (str.equals("KM")) {
                                                            return 74972;
                                                        }
                                                        break;
                                                    case 2403:
                                                        if (str.equals("KN")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            return 149648;
                                                        }
                                                        break;
                                                    case 2412:
                                                        if (str.equals("KW")) {
                                                            return 65537;
                                                        }
                                                        break;
                                                    case 2414:
                                                        if (str.equals("KY")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2415:
                                                        if (str.equals("KZ")) {
                                                            return 78986;
                                                        }
                                                        break;
                                                    case 2421:
                                                        if (str.equals("LA")) {
                                                            return 75345;
                                                        }
                                                        break;
                                                    case 2422:
                                                        if (str.equals("LB")) {
                                                            return 74827;
                                                        }
                                                        break;
                                                    case 2423:
                                                        if (str.equals("LC")) {
                                                            return 74322;
                                                        }
                                                        break;
                                                    case 2429:
                                                        if (str.equals("LI")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2431:
                                                        if (str.equals("LK")) {
                                                            return 83667;
                                                        }
                                                        break;
                                                    case 2438:
                                                        if (str.equals("LR")) {
                                                            return 76067;
                                                        }
                                                        break;
                                                    case 2439:
                                                        if (str.equals("LS")) {
                                                            return 75484;
                                                        }
                                                        break;
                                                    case 2440:
                                                        if (str.equals("LT")) {
                                                            return 66056;
                                                        }
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            return 103620;
                                                        }
                                                        break;
                                                    case 2442:
                                                        if (str.equals("LV")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2445:
                                                        if (str.equals("LY")) {
                                                            return 75476;
                                                        }
                                                        break;
                                                    case 2452:
                                                        if (str.equals("MA")) {
                                                            return 74331;
                                                        }
                                                        break;
                                                    case 2454:
                                                        if (str.equals("MC")) {
                                                            return 73873;
                                                        }
                                                        break;
                                                    case 2455:
                                                        if (str.equals("MD")) {
                                                            return 73729;
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (str.equals("ME")) {
                                                            return 78338;
                                                        }
                                                        break;
                                                    case 2457:
                                                        if (str.equals("MF")) {
                                                            return 75409;
                                                        }
                                                        break;
                                                    case 2458:
                                                        if (str.equals("MG")) {
                                                            return 75491;
                                                        }
                                                        break;
                                                    case 2459:
                                                        if (str.equals("MH")) {
                                                            return 75924;
                                                        }
                                                        break;
                                                    case 2462:
                                                        if (str.equals("MK")) {
                                                            return 78337;
                                                        }
                                                        break;
                                                    case 2463:
                                                        if (str.equals("ML")) {
                                                            return 74907;
                                                        }
                                                        break;
                                                    case 2464:
                                                        if (str.equals("MM")) {
                                                            return 83667;
                                                        }
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            return 74882;
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            return 47376;
                                                        }
                                                        break;
                                                    case 2467:
                                                        if (str.equals("MP")) {
                                                            return 74897;
                                                        }
                                                        break;
                                                    case 2468:
                                                        if (str.equals("MQ")) {
                                                            return 75402;
                                                        }
                                                        break;
                                                    case 2469:
                                                        if (str.equals("MR")) {
                                                            return 75996;
                                                        }
                                                        break;
                                                    case 2470:
                                                        if (str.equals("MS")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2471:
                                                        if (str.equals("MT")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2472:
                                                        if (str.equals("MU")) {
                                                            return 74763;
                                                        }
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            return 83539;
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            return 74387;
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (str.equals("MX")) {
                                                            return 80162;
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (str.equals("MY")) {
                                                            return 4865;
                                                        }
                                                        break;
                                                    case 2477:
                                                        if (str.equals("MZ")) {
                                                            return 74891;
                                                        }
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            return 74979;
                                                        }
                                                        break;
                                                    case 2485:
                                                        if (str.equals("NC")) {
                                                            return 75994;
                                                        }
                                                        break;
                                                    case 2487:
                                                        if (str.equals("NE")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2488:
                                                        if (str.equals("NF")) {
                                                            return 74899;
                                                        }
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            return 74403;
                                                        }
                                                        break;
                                                    case 2491:
                                                        if (str.equals("NI")) {
                                                            return 76066;
                                                        }
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            return 132874;
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            return 65728;
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            return 75538;
                                                        }
                                                        break;
                                                    case 2500:
                                                        if (str.equals("NR")) {
                                                            return 76052;
                                                        }
                                                        break;
                                                    case 2503:
                                                        if (str.equals("NU")) {
                                                            return 74900;
                                                        }
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            return 83008;
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            return 83034;
                                                        }
                                                        break;
                                                    case 2545:
                                                        if (str.equals("PA")) {
                                                            return 75418;
                                                        }
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            return 80145;
                                                        }
                                                        break;
                                                    case 2550:
                                                        if (str.equals("PF")) {
                                                            return 74450;
                                                        }
                                                        break;
                                                    case 2551:
                                                        if (str.equals("PG")) {
                                                            return 75484;
                                                        }
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            return 42634;
                                                        }
                                                        break;
                                                    case 2555:
                                                        if (str.equals("PK")) {
                                                            return 75483;
                                                        }
                                                        break;
                                                    case 2556:
                                                        if (str.equals("PL")) {
                                                            return 148609;
                                                        }
                                                        break;
                                                    case 2557:
                                                        if (str.equals("PM")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            return 8834;
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            return 75363;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (str.equals("PT")) {
                                                            return 69632;
                                                        }
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            return 74514;
                                                        }
                                                        break;
                                                    case 2569:
                                                        if (str.equals("PY")) {
                                                            return 74897;
                                                        }
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            return 84257;
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            return 71320;
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            return 78400;
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (str.equals("RS")) {
                                                            return 74241;
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            return 111105;
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            return 73883;
                                                        }
                                                        break;
                                                    case 2638:
                                                        if (str.equals("SA")) {
                                                            return 9291;
                                                        }
                                                        break;
                                                    case 2639:
                                                        if (str.equals("SB")) {
                                                            return 75540;
                                                        }
                                                        break;
                                                    case 2640:
                                                        if (str.equals("SC")) {
                                                            return 74900;
                                                        }
                                                        break;
                                                    case 2641:
                                                        if (str.equals("SD")) {
                                                            return 76060;
                                                        }
                                                        break;
                                                    case 2642:
                                                        if (str.equals("SE")) {
                                                            return 65536;
                                                        }
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            return 38618;
                                                        }
                                                        break;
                                                    case 2645:
                                                        if (str.equals("SH")) {
                                                            return 74900;
                                                        }
                                                        break;
                                                    case 2646:
                                                        if (str.equals("SI")) {
                                                            return 69632;
                                                        }
                                                        break;
                                                    case 2647:
                                                        if (str.equals("SJ")) {
                                                            return 74899;
                                                        }
                                                        break;
                                                    case 2648:
                                                        if (str.equals("SK")) {
                                                            return 74312;
                                                        }
                                                        break;
                                                    case 2649:
                                                        if (str.equals("SL")) {
                                                            return 75476;
                                                        }
                                                        break;
                                                    case 2650:
                                                        if (str.equals("SM")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2651:
                                                        if (str.equals("SN")) {
                                                            return 74980;
                                                        }
                                                        break;
                                                    case 2652:
                                                        if (str.equals("SO")) {
                                                            return 84178;
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (str.equals("SR")) {
                                                            return 74530;
                                                        }
                                                        break;
                                                    case 2656:
                                                        if (str.equals("SS")) {
                                                            return 75932;
                                                        }
                                                        break;
                                                    case 2657:
                                                        if (str.equals("ST")) {
                                                            return 74834;
                                                        }
                                                        break;
                                                    case 2659:
                                                        if (str.equals("SV")) {
                                                            return 74394;
                                                        }
                                                        break;
                                                    case 2661:
                                                        if (str.equals("SX")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2662:
                                                        if (str.equals("SY")) {
                                                            return 76060;
                                                        }
                                                        break;
                                                    case 2663:
                                                        if (str.equals("SZ")) {
                                                            return 76004;
                                                        }
                                                        break;
                                                    case 2671:
                                                        if (str.equals("TC")) {
                                                            return 74835;
                                                        }
                                                        break;
                                                    case 2672:
                                                        if (str.equals("TD")) {
                                                            return 76060;
                                                        }
                                                        break;
                                                    case 2675:
                                                        if (str.equals("TG")) {
                                                            return 73827;
                                                        }
                                                        break;
                                                    case 2676:
                                                        if (str.equals("TH")) {
                                                            return 74888;
                                                        }
                                                        break;
                                                    case 2678:
                                                        if (str.equals("TJ")) {
                                                            return 76059;
                                                        }
                                                        break;
                                                    case 2680:
                                                        if (str.equals("TL")) {
                                                            return 76052;
                                                        }
                                                        break;
                                                    case 2681:
                                                        if (str.equals("TM")) {
                                                            return 75924;
                                                        }
                                                        break;
                                                    case 2682:
                                                        if (str.equals("TN")) {
                                                            return 74315;
                                                        }
                                                        break;
                                                    case 2683:
                                                        if (str.equals("TO")) {
                                                            return 75539;
                                                        }
                                                        break;
                                                    case 2686:
                                                        if (str.equals("TR")) {
                                                            return 74313;
                                                        }
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            return 73826;
                                                        }
                                                        break;
                                                    case 2690:
                                                        if (str.equals("TV")) {
                                                            return 75924;
                                                        }
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            return 0;
                                                        }
                                                        break;
                                                    case 2694:
                                                        if (str.equals("TZ")) {
                                                            return 78499;
                                                        }
                                                        break;
                                                    case 2700:
                                                        if (str.equals("UA")) {
                                                            return 111696;
                                                        }
                                                        break;
                                                    case 2706:
                                                        if (str.equals("UG")) {
                                                            return 83611;
                                                        }
                                                        break;
                                                    case 2718:
                                                        if (str.equals("US")) {
                                                            return 45842;
                                                        }
                                                        break;
                                                    case 2724:
                                                        if (str.equals("UY")) {
                                                            return 70730;
                                                        }
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            return 80081;
                                                        }
                                                        break;
                                                    case 2731:
                                                        if (str.equals("VA")) {
                                                            return 74896;
                                                        }
                                                        break;
                                                    case 2733:
                                                        if (str.equals("VC")) {
                                                            return 73745;
                                                        }
                                                        break;
                                                    case 2735:
                                                        if (str.equals("VE")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2737:
                                                        if (str.equals("VG")) {
                                                            return 139858;
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            return 74832;
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            return 74816;
                                                        }
                                                        break;
                                                    case 2751:
                                                        if (str.equals("VU")) {
                                                            return 74972;
                                                        }
                                                        break;
                                                    case 2767:
                                                        if (str.equals("WF")) {
                                                            return 75924;
                                                        }
                                                        break;
                                                    case 2780:
                                                        if (str.equals("WS")) {
                                                            return 74891;
                                                        }
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            return 74321;
                                                        }
                                                        break;
                                                    case 2828:
                                                        if (str.equals("YE")) {
                                                            return 76068;
                                                        }
                                                        break;
                                                    case 2843:
                                                        if (str.equals("YT")) {
                                                            return 75994;
                                                        }
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            return 70306;
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            return 75556;
                                                        }
                                                        break;
                                                    case 2877:
                                                        if (str.equals("ZW")) {
                                                            return 75540;
                                                        }
                                                        break;
                                                    default:
                                                        switch (str) {
                                                            case 2096:
                                                                if (str.equals("AQ")) {
                                                                    return 74900;
                                                                }
                                                                break;
                                                            case 2097:
                                                                if (str.equals("AR")) {
                                                                    return 70802;
                                                                }
                                                                break;
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    return 75474;
                                                                }
                                                                break;
                                                            case 2099:
                                                                if (str.equals("AT")) {
                                                                    return 65536;
                                                                }
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    return 12888;
                                                                }
                                                                break;
                                                            default:
                                                                switch (str) {
                                                                    case 2122:
                                                                        if (str.equals("BL")) {
                                                                            return 74897;
                                                                        }
                                                                        break;
                                                                    case 2123:
                                                                        if (str.equals("BM")) {
                                                                            return 73744;
                                                                        }
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            return 73747;
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                            return 76049;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (str) {
                                                                            case 2127:
                                                                                if (str.equals("BQ")) {
                                                                                    return 73745;
                                                                                }
                                                                                break;
                                                                            case 2128:
                                                                                if (str.equals("BR")) {
                                                                                    return 139849;
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                if (str.equals("BS")) {
                                                                                    return 74323;
                                                                                }
                                                                                break;
                                                                            case 2130:
                                                                                if (str.equals("BT")) {
                                                                                    return 78987;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (iHashCode) {
                                                                                    case 2147:
                                                                                        if (str.equals("CF")) {
                                                                                            return 75028;
                                                                                        }
                                                                                        break;
                                                                                    case 2148:
                                                                                        if (str.equals("CG")) {
                                                                                            return 75491;
                                                                                        }
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return 65544;
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        if (str.equals("CI")) {
                                                                                            return 76002;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                        }
                                    } else if (str.equals("BZ")) {
                                        return 74386;
                                    }
                                } else if (str.equals("BY")) {
                                    return 75473;
                                }
                            } else if (str.equals("BB")) {
                                return 73745;
                            }
                        } else if (str.equals("BA")) {
                            return 74313;
                        }
                    } else if (str.equals("AX")) {
                        return 74896;
                    }
                } else if (str.equals("AW")) {
                    return 75986;
                }
            } else if (str.equals("AM")) {
                return 75418;
            }
        } else if (str.equals("AL")) {
            return 74825;
        }
        return 74898;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    private final long i(int i) {
        long jLongValue;
        aigf aigfVar = this.j;
        java.lang.Long lValueOf = (java.lang.Long) aigfVar.get(java.lang.Integer.valueOf(i));
        if (lValueOf == null) {
            lValueOf = (java.lang.Long) aigfVar.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            int iH = h(ahvr.co(this.t));
            if (i == 2) {
                jLongValue = ((java.lang.Long) a.get(iH & 7)).longValue();
            } else if (i == 3) {
                jLongValue = ((java.lang.Long) b.get((iH >> 3) & 7)).longValue();
            } else if (i == 4) {
                jLongValue = ((java.lang.Long) c.get((iH >> 6) & 7)).longValue();
            } else if (i == 5) {
                jLongValue = ((java.lang.Long) d.get((iH >> 9) & 7)).longValue();
            } else if (i == 7) {
                jLongValue = ((java.lang.Long) a.get(iH & 7)).longValue();
            } else if (i == 9) {
                jLongValue = ((java.lang.Long) f.get(iH >> 15)).longValue();
            } else if (i != 10) {
                jLongValue = 1000000;
            } else {
                jLongValue = ((java.lang.Long) e.get((iH >> 12) & 7)).longValue();
            }
            lValueOf = java.lang.Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private final void j(int i, long j, long j2) {
        final long j3;
        final int i2;
        if (i == 0) {
            if (j != 0) {
                j3 = j;
            } else if (j2 == this.r) {
                return;
            } else {
                j3 = 0;
            }
            i2 = 0;
        } else {
            j2 = j2;
            j3 = j;
            i2 = i;
        }
        this.r = j2;
        for (final defpackage.aae aaeVar : (java.util.concurrent.CopyOnWriteArrayList) this.g.a) {
            if (!aaeVar.a) {
                final int i3 = 1;
                ((android.os.Handler) aaeVar.b).post(new java.lang.Runnable() { // from class: jwv
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 != 0) {
                            defpackage.ezv ezvVar = (defpackage.ezv) ((defpackage.aae) aaeVar).c;
                            defpackage.ezu ezuVar = ezvVar.b;
                            defpackage.ffu ffuVar = ezuVar.b.isEmpty() ? null : (defpackage.ffu) ahvr.bk(ezuVar.b);
                            final long j4 = j3;
                            final int i4 = i2;
                            final defpackage.ezm ezmVarB = ezvVar.B(ffuVar);
                            ezvVar.F(ezmVarB, 1006, new defpackage.etl() { // from class: ezn
                                @Override // defpackage.etl
                                public final void a(java.lang.Object obj) {
                                    defpackage.ezm ezmVar = ezmVarB;
                                    defpackage.ffu ffuVar2 = ezmVar.d;
                                    defpackage.fad fadVar = (defpackage.fad) obj;
                                    if (ffuVar2 != null) {
                                        java.lang.String strD = fadVar.c.d(ezmVar.b, ffuVar2);
                                        java.util.HashMap map = fadVar.g;
                                        java.lang.Long l = (java.lang.Long) map.get(strD);
                                        java.util.HashMap map2 = fadVar.f;
                                        java.lang.Long l2 = (java.lang.Long) map2.get(strD);
                                        map.put(strD, java.lang.Long.valueOf((l == null ? 0L : l.longValue()) + j4));
                                        map2.put(strD, java.lang.Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i4)));
                                    }
                                }
                            });
                            return;
                        }
                        int i5 = i2;
                        long j5 = j3;
                        java.lang.Object obj = aaeVar;
                        int i6 = i5 - 1;
                        if (i6 == 0) {
                            ((kgl) obj).c(j5, new defpackage.fch(12));
                            return;
                        }
                        if (i6 == 1) {
                            ((kgl) obj).c(j5, new defpackage.fch(13));
                            return;
                        }
                        if (i6 == 2) {
                            ((kgl) obj).c(j5, new defpackage.fch(14));
                            return;
                        }
                        if (i6 == 3) {
                            ((kgl) obj).c(j5, new defpackage.fch(15));
                            return;
                        }
                        if (i6 == 4) {
                            ((kgl) obj).c(j5, new defpackage.fch(16));
                            return;
                        }
                        if (i6 == 6) {
                            ((kgl) obj).c(j5, new defpackage.fch(17));
                        } else if (i6 != 7) {
                            ((kgl) obj).c(j5, new defpackage.fch(19));
                        } else {
                            ((kgl) obj).c(j5, new defpackage.fch(18));
                        }
                    }
                });
            }
        }
    }

    private static boolean k(defpackage.evv evvVar, boolean z) {
        return z && !evvVar.b(8);
    }

    @Override // defpackage.ewm
    public final synchronized void a(defpackage.evv evvVar, boolean z, int i) {
        if (k(evvVar, z)) {
            this.n += (long) i;
        }
    }

    @Override // defpackage.ewm
    public final synchronized void b(defpackage.evv evvVar, boolean z) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.fir firVar;
        defpackage.fiz fizVar;
        float f2;
        try {
            try {
                if (k(evvVar, z)) {
                    int i = 0;
                    ahvr.bY(this.l > 0);
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    int i2 = (int) (jElapsedRealtime - this.m);
                    this.o += (long) i2;
                    long j = this.p;
                    long j2 = this.n;
                    this.p = j + j2;
                    if (i2 > 0) {
                        float f3 = j2;
                        defpackage.fja fjaVar = this.k;
                        int iSqrt = (int) java.lang.Math.sqrt(j2);
                        if (fjaVar.e != 1) {
                            try {
                                j$.util.List.-EL.sort(fjaVar.c, defpackage.fja.a);
                                fjaVar.e = 1;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                            }
                        }
                        int i3 = fjaVar.h;
                        if (i3 > 0) {
                            defpackage.fiz[] fizVarArr = fjaVar.d;
                            int i4 = i3 - 1;
                            fjaVar.h = i4;
                            fizVar = fizVarArr[i4];
                        } else {
                            fizVar = new defpackage.fiz();
                        }
                        int i5 = fjaVar.f;
                        fjaVar.f = i5 + 1;
                        fizVar.a = i5;
                        fizVar.b = iSqrt;
                        fizVar.c = (f3 * 8000.0f) / i2;
                        java.util.ArrayList arrayList = fjaVar.c;
                        arrayList.add(fizVar);
                        fjaVar.g += iSqrt;
                        while (true) {
                            int i6 = fjaVar.g;
                            if (i6 <= 2000) {
                                break;
                            }
                            int i7 = i6 - 2000;
                            defpackage.fiz fizVar2 = (defpackage.fiz) arrayList.get(0);
                            int i8 = fizVar2.b;
                            if (i8 <= i7) {
                                fjaVar.g -= i8;
                                arrayList.remove(0);
                                int i9 = fjaVar.h;
                                if (i9 < 5) {
                                    defpackage.fiz[] fizVarArr2 = fjaVar.d;
                                    fjaVar.h = i9 + 1;
                                    fizVarArr2[i9] = fizVar2;
                                }
                            } else {
                                fizVar2.b = i8 - i7;
                                fjaVar.g -= i7;
                            }
                        }
                        if (this.o >= 2000 || this.p >= 524288) {
                            if (fjaVar.e != 0) {
                                j$.util.List.-EL.sort(arrayList, defpackage.fja.b);
                                fjaVar.e = 0;
                            }
                            float f4 = fjaVar.g;
                            int i10 = 0;
                            while (true) {
                                if (i >= arrayList.size()) {
                                    if (!arrayList.isEmpty()) {
                                        f2 = ((defpackage.fiz) arrayList.get(arrayList.size() - 1)).c;
                                        break;
                                    } else {
                                        f2 = Float.NaN;
                                        break;
                                    }
                                }
                                float f5 = 0.5f * f4;
                                defpackage.fiz fizVar3 = (defpackage.fiz) arrayList.get(i);
                                i10 += fizVar3.b;
                                if (i10 >= f5) {
                                    f2 = fizVar3.c;
                                    break;
                                }
                                i++;
                            }
                            this.q = (long) f2;
                        }
                        firVar = this;
                        firVar.j(i2, this.n, this.q);
                        firVar.m = jElapsedRealtime;
                        firVar.n = 0L;
                    } else {
                        firVar = this;
                    }
                    firVar.l--;
                    return;
                }
                return;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }

    @Override // defpackage.ewm
    public final synchronized void d(defpackage.evv evvVar, boolean z) {
        if (k(evvVar, z)) {
            if (this.l == 0) {
                this.m = android.os.SystemClock.elapsedRealtime();
            }
            this.l++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0018 A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #2 {all -> 0x005b, blocks: (B:5:0x0005, B:14:0x0018, B:16:0x001e, B:18:0x0028, B:20:0x0032, B:22:0x0043, B:21:0x0037, B:26:0x0054), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:5:0x0005, B:14:0x0018, B:16:0x001e, B:18:0x0028, B:20:0x0032, B:22:0x0043, B:21:0x0037, B:26:0x0054), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[Catch: all -> 0x005b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:5:0x0005, B:14:0x0018, B:16:0x001e, B:18:0x0028, B:20:0x0032, B:22:0x0043, B:21:0x0037, B:26:0x0054), top: B:49:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0009 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:3:0x0001, B:7:0x0009, B:12:0x0014, B:23:0x0045, B:31:0x0060), top: B:46:0x0001 }] */
    public final synchronized void g(int i) {
        java.lang.Throwable th;
        long jElapsedRealtime;
        int i2;
        android.content.Context context;
        java.lang.String strQ;
        android.telephony.TelephonyManager telephonyManager;
        try {
            try {
                if (this.s == i) {
                    try {
                        if (this.t == null) {
                            this.s = i;
                            if (i != 1 && i != 0 && i != 8) {
                                if (this.t == null) {
                                    context = this.i;
                                    java.lang.String str = eum.a;
                                    if (context != null || (telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone")) == null) {
                                        strQ = ahvr.q(java.util.Locale.getDefault().getCountry());
                                    } else {
                                        java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (android.text.TextUtils.isEmpty(networkCountryIso)) {
                                            strQ = ahvr.q(java.util.Locale.getDefault().getCountry());
                                        } else {
                                            strQ = ahvr.q(networkCountryIso);
                                        }
                                    }
                                    this.t = strQ;
                                }
                                this.q = i(i);
                                jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                if (this.l > 0) {
                                    i2 = (int) (jElapsedRealtime - this.m);
                                } else {
                                    i2 = 0;
                                }
                                j(i2, this.n, this.q);
                                this.m = jElapsedRealtime;
                                this.n = 0L;
                                this.p = 0L;
                                this.o = 0L;
                                defpackage.fja fjaVar = this.k;
                                fjaVar.c.clear();
                                fjaVar.e = -1;
                                fjaVar.f = 0;
                                fjaVar.g = 0;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    this.s = i;
                    if (i != 1) {
                        if (this.t == null) {
                            context = this.i;
                            java.lang.String str2 = eum.a;
                            if (context != null) {
                                strQ = ahvr.q(java.util.Locale.getDefault().getCountry());
                            } else {
                                strQ = ahvr.q(java.util.Locale.getDefault().getCountry());
                            }
                            this.t = strQ;
                        }
                        this.q = i(i);
                        jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        if (this.l > 0) {
                            i2 = (int) (jElapsedRealtime - this.m);
                        } else {
                            i2 = 0;
                        }
                        j(i2, this.n, this.q);
                        this.m = jElapsedRealtime;
                        this.n = 0L;
                        this.p = 0L;
                        this.o = 0L;
                        defpackage.fja fjaVar2 = this.k;
                        fjaVar2.c.clear();
                        fjaVar2.e = -1;
                        fjaVar2.f = 0;
                        fjaVar2.g = 0;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.ewm
    public final void c() {
    }

    @Override // defpackage.fip
    public final defpackage.ewm e() {
        return this;
    }
}
