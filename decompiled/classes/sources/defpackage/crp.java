package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class crp {
    private static final defpackage.csc A;
    private static final defpackage.csc B;
    public static final float[] a;
    public static final float[] b;
    public static final defpackage.csc c;
    public static final defpackage.csc d;
    public static final defpackage.csb e;
    public static final defpackage.csb f;
    public static final defpackage.csb g;
    public static final defpackage.csb h;
    public static final defpackage.csb i;
    public static final defpackage.csb j;
    public static final defpackage.csb k;
    public static final defpackage.csb l;
    public static final defpackage.csb m;
    public static final defpackage.csb n;
    public static final defpackage.csb o;
    public static final defpackage.csb p;
    public static final defpackage.csb q;
    public static final defpackage.csb r;
    public static final defpackage.crn s;
    public static final defpackage.crn t;
    public static final defpackage.csb u;
    public static final defpackage.csb v;
    public static final defpackage.csb w;
    public static final defpackage.crn x;
    public static final defpackage.crn[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        defpackage.csc cscVar = new defpackage.csc(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        A = cscVar;
        defpackage.csc cscVar2 = new defpackage.csc(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        B = cscVar2;
        defpackage.csc cscVar3 = new defpackage.csc(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = cscVar3;
        defpackage.csc cscVar4 = new defpackage.csc(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = cscVar4;
        defpackage.csd csdVar = defpackage.crv.a;
        defpackage.csb csbVar = new defpackage.csb("sRGB IEC61966-2.1", fArr, defpackage.crv.d, cscVar, 0);
        e = csbVar;
        defpackage.csb csbVar2 = new defpackage.csb("sRGB IEC61966-2.1 (Linear)", fArr, defpackage.crv.d, 1.0d, 0.0f, 1.0f, 1);
        f = csbVar2;
        defpackage.csb csbVar3 = new defpackage.csb("scRGB-nl IEC 61966-2-2:2003", fArr, defpackage.crv.d, null, new defpackage.cro(1), new defpackage.cro(0), -0.799f, 2.399f, cscVar, 2);
        g = csbVar3;
        defpackage.csb csbVar4 = new defpackage.csb("scRGB IEC 61966-2-2:2003", fArr, defpackage.crv.d, 1.0d, -0.5f, 7.499f, 3);
        h = csbVar4;
        defpackage.csb csbVar5 = new defpackage.csb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, defpackage.crv.d, new defpackage.csc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 4);
        i = csbVar5;
        defpackage.csb csbVar6 = new defpackage.csb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, defpackage.crv.d, new defpackage.csc(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d), 5);
        j = csbVar6;
        defpackage.csb csbVar7 = new defpackage.csb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new defpackage.csd(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = csbVar7;
        defpackage.csb csbVar8 = new defpackage.csb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, defpackage.crv.d, cscVar, 7);
        l = csbVar8;
        defpackage.csb csbVar9 = new defpackage.csb("NTSC (1953)", fArr2, defpackage.crv.a, new defpackage.csc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 8);
        m = csbVar9;
        defpackage.csb csbVar10 = new defpackage.csb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, defpackage.crv.d, new defpackage.csc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 9);
        n = csbVar10;
        defpackage.csb csbVar11 = new defpackage.csb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, defpackage.crv.d, 2.2d, 0.0f, 1.0f, 10);
        o = csbVar11;
        defpackage.csb csbVar12 = new defpackage.csb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, defpackage.crv.b, new defpackage.csc(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d), 11);
        p = csbVar12;
        defpackage.csb csbVar13 = new defpackage.csb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, defpackage.crv.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = csbVar13;
        defpackage.csb csbVar14 = new defpackage.csb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, defpackage.crv.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = csbVar14;
        defpackage.cse cseVar = new defpackage.cse();
        s = cseVar;
        defpackage.crw crwVar = new defpackage.crw();
        t = crwVar;
        defpackage.csb csbVar15 = new defpackage.csb("None", fArr, defpackage.crv.d, cscVar2, 16);
        u = csbVar15;
        defpackage.csb csbVar16 = new defpackage.csb("Hybrid Log Gamma encoding", fArr3, defpackage.crv.d, null, new defpackage.cro(2), new defpackage.cro(3), 0.0f, 1.0f, cscVar3, 17);
        v = csbVar16;
        defpackage.csb csbVar17 = new defpackage.csb("Perceptual Quantizer encoding", fArr3, defpackage.crv.d, null, new defpackage.cro(4), new defpackage.cro(5), 0.0f, 1.0f, cscVar4, 18);
        w = csbVar17;
        defpackage.crx crxVar = new defpackage.crx();
        x = crxVar;
        y = new defpackage.crn[]{csbVar, csbVar2, csbVar3, csbVar4, csbVar5, csbVar6, csbVar7, csbVar8, csbVar9, csbVar10, csbVar11, csbVar12, csbVar13, csbVar14, cseVar, crwVar, csbVar15, csbVar16, csbVar17, crxVar};
    }

    public static final double a(defpackage.csc cscVar, double d2) {
        double dExp;
        double d3 = cscVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = cscVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = java.lang.Math.pow(d6, cscVar.c);
        } else {
            dExp = java.lang.Math.exp((d5 - cscVar.f) * cscVar.d) + cscVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(defpackage.csc cscVar, double d2) {
        double d3 = 1.0d / cscVar.b;
        double d4 = 1.0d / cscVar.c;
        double d5 = 1.0d / cscVar.d;
        double d6 = cscVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * java.lang.Math.pow(d8, d4) : cscVar.f + (d5 * java.lang.Math.log(d8 - cscVar.e)));
    }

    public static final double c(defpackage.csc cscVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = cscVar.d;
        double dPow = cscVar.b + (cscVar.c * java.lang.Math.pow(d4, d5));
        return d3 * java.lang.Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (cscVar.e + (cscVar.f * java.lang.Math.pow(d4, d5))), cscVar.g);
    }

    public static final double d(defpackage.csc cscVar, double d2) {
        double d3 = -cscVar.b;
        double d4 = 1.0d / cscVar.g;
        double d5 = -cscVar.f;
        double d6 = 1.0d / cscVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * java.lang.Math.pow(java.lang.Math.max(d3 + (cscVar.e * java.lang.Math.pow(d8, d4)), 0.0d) / (cscVar.c + (d5 * java.lang.Math.pow(d8, d4))), d6);
    }
}
