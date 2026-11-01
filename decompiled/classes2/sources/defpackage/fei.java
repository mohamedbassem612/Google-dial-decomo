package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class fei extends defpackage.ewz {
    public boolean A;
    public boolean B;
    public long C;
    public boolean D;
    public defpackage.exl E;
    public defpackage.exc F;
    public long G;
    public long H;
    public rai I;
    private final java.util.ArrayDeque J;
    private final defpackage.fcb K;
    private defpackage.eqg L;
    private defpackage.fcs M;
    private defpackage.fcs N;
    private android.media.MediaCrypto O;
    private float P;
    private boolean Q;
    private float R;
    private java.util.ArrayDeque S;
    private defpackage.feg T;
    private boolean U;
    private long V;
    private boolean W;
    private int X;
    private int Y;
    private java.nio.ByteBuffer Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private long aj;
    private boolean ak;
    private boolean al;
    private defpackage.feh am;
    private boolean an;
    private boolean ao;
    private long ap;
    private defpackage.exa aq;
    private defpackage.exa ar;
    private aihd as;
    private final android.content.Context k;
    private final defpackage.fdz l;
    private final defpackage.fek m;
    private final defpackage.ewu n;
    private final defpackage.ewu o;
    private final defpackage.fdw p;
    private final android.media.MediaCodec.BufferInfo q;
    public final defpackage.ewu r;
    public final java.util.concurrent.atomic.AtomicInteger s;
    public defpackage.eqg t;
    public float u;
    public defpackage.fea v;
    public defpackage.eqg w;
    public android.media.MediaFormat x;
    public defpackage.fee y;
    public long z;

    public fei(android.content.Context context, int i, defpackage.fdz fdzVar, defpackage.fek fekVar) {
        super(i);
        this.k = context.getApplicationContext();
        this.l = fdzVar;
        ahvr.ci(fekVar);
        this.m = fekVar;
        this.s = new java.util.concurrent.atomic.AtomicInteger();
        this.n = new defpackage.ewu(0);
        this.r = new defpackage.ewu(0);
        this.o = new defpackage.ewu(2);
        defpackage.fdw fdwVar = new defpackage.fdw();
        this.p = fdwVar;
        this.q = new android.media.MediaCodec.BufferInfo();
        this.u = 1.0f;
        this.P = 1.0f;
        this.J = new java.util.ArrayDeque();
        this.am = defpackage.feh.a;
        fdwVar.d(0);
        fdwVar.d.order(java.nio.ByteOrder.nativeOrder());
        this.K = new defpackage.fcb();
        this.R = -1.0f;
        this.af = 0;
        this.X = -1;
        this.Y = -1;
        this.z = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.ag = 0;
        this.ah = 0;
        this.F = new defpackage.exc();
        this.ao = false;
        this.H = 0L;
        this.ap = -9223372036854775807L;
        this.as = aikn.a;
        defpackage.exa exaVar = defpackage.exa.a;
        this.aq = exaVar;
        this.ar = exaVar;
    }

    protected static boolean aL(defpackage.eqg eqgVar) {
        int i = eqgVar.Q;
        return i == 0 || i == 2;
    }

    private final long aO() {
        return aP().a() ? this.aj : this.C;
    }

    private final defpackage.feh aP() {
        java.util.ArrayDeque arrayDeque = this.J;
        return !arrayDeque.isEmpty() ? (defpackage.feh) arrayDeque.getLast() : this.am;
    }

    private final void aQ() {
        this.A = false;
        aV();
    }

    private final void aR() throws java.lang.Throwable {
        if (!this.B) {
            aU();
        } else {
            this.ag = 1;
            this.ah = 3;
        }
    }

    private final void aS() {
        try {
            defpackage.fea feaVar = this.v;
            ahvr.ci(feaVar);
            feaVar.h();
        } finally {
            am();
        }
    }

    private final void aT() throws java.lang.Throwable {
        int i = this.ah;
        if (i == 1) {
            aS();
            return;
        }
        if (i == 2) {
            aS();
            bd();
        } else if (i == 3) {
            aU();
        } else {
            this.D = true;
            al();
        }
    }

    private final void aU() throws java.lang.Throwable {
        aC();
        az();
    }

    private final void aV() {
        aW();
        this.ad = false;
        this.p.dJ();
        this.o.dJ();
        this.ac = false;
        defpackage.fcb fcbVar = this.K;
        fcbVar.c = defpackage.esj.a;
        fcbVar.e = 0;
        fcbVar.d = 2;
    }

    private final void aW() {
        this.C = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        aP().i = -9223372036854775807L;
        this.G = -9223372036854775807L;
    }

    private final void aX() {
        this.X = -1;
        this.r.d = null;
    }

    private final void aY() {
        this.Y = -1;
        this.Z = null;
    }

    private final void aZ(defpackage.fcs fcsVar) {
        defpackage.hgu.aw(this.M, fcsVar);
        this.M = fcsVar;
    }

    private final void ba(defpackage.feh fehVar) {
        this.am = fehVar;
        long j = fehVar.d;
        if (j != -9223372036854775807L) {
            this.an = true;
            aj(j);
        }
    }

    private final void bb(defpackage.fcs fcsVar) {
        defpackage.hgu.aw(this.N, fcsVar);
        this.N = fcsVar;
    }

    private final void bc(defpackage.eqg eqgVar) {
        if (this.v == null || this.ah == 3 || this.b == 0) {
            return;
        }
        float f = this.P;
        ahvr.ci(eqgVar);
        float fZ = Z(f, eqgVar, N());
        float f2 = this.R;
        if (f2 == fZ || fZ == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fZ > 0.0f) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("operating-rate", fZ);
            defpackage.fea feaVar = this.v;
            ahvr.ci(feaVar);
            feaVar.l(bundle);
            this.R = fZ;
        }
    }

    private final void bd() throws defpackage.exl {
        defpackage.fcs fcsVar = this.N;
        ahvr.ci(fcsVar);
        defpackage.fdb fdbVarM = fcsVar.m();
        if (fdbVarM instanceof defpackage.fdb) {
            try {
                android.media.MediaCrypto mediaCrypto = this.O;
                ahvr.ci(mediaCrypto);
                mediaCrypto.setMediaDrmSession(fdbVarM.c);
            } catch (android.media.MediaCryptoException e) {
                throw h(e, this.t, false, 6006);
            }
        }
        aZ(this.N);
        this.ag = 0;
        this.ah = 0;
    }

    private final boolean be() throws defpackage.exl {
        if (!this.B) {
            bd();
            return true;
        }
        this.ag = 1;
        if (aK()) {
            this.ah = 3;
            return false;
        }
        this.ah = 2;
        return true;
    }

    private final boolean bf() {
        if (this.v != null) {
            if (aK()) {
                aC();
                return true;
            }
            if (aH()) {
                aS();
            } else if (this.B) {
                this.ao = true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    private final boolean bg() throws defpackage.exl {
        ahvr.bY(this.O == null);
        defpackage.fcs fcsVar = this.M;
        defpackage.fdb fdbVarM = fcsVar.m();
        int i = defpackage.equ.a;
        if (defpackage.fdb.a && (fdbVarM instanceof defpackage.fdb)) {
            int iA = fcsVar.a();
            if (iA == 1) {
                defpackage.fcr fcrVarB = fcsVar.b();
                ahvr.ci(fcrVarB);
                throw h(fcrVarB, this.t, false, fcrVarB.a);
            }
            if (iA == 4) {
                if (fdbVarM == null) {
                    this.O = new android.media.MediaCrypto(fdbVarM.b, fdbVarM.c);
                    return true;
                }
                if (fcsVar.b() != null) {
                    return true;
                }
            }
        } else {
            if (fdbVarM == null) {
                try {
                    this.O = new android.media.MediaCrypto(fdbVarM.b, fdbVarM.c);
                    return true;
                } catch (android.media.MediaCryptoException e) {
                    throw h(e, this.t, false, 6006);
                }
            }
            if (fcsVar.b() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean bh(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        defpackage.eqg eqgVar = this.L;
        return (eqgVar != null && j$.util.Objects.equals(eqgVar.p, "audio/opus") && defpackage.hgt.aB(j, j2)) ? false : true;
    }

    private final boolean bi(int i) throws java.lang.Throwable {
        defpackage.hiz hizVarT = T();
        defpackage.ewu ewuVar = this.n;
        ewuVar.dJ();
        int iS = S(hizVarT, ewuVar, i | 4);
        if (iS == -5) {
            ar(hizVarT);
            return true;
        }
        if (iS == -4 && ewuVar.dL(4)) {
            this.ak = true;
            aT();
        }
        return false;
    }

    @Override // defpackage.ewz, defpackage.ezf
    public void F(float f, float f2) {
        this.u = f;
        this.P = f2;
        bc(this.w);
    }

    @Override // defpackage.ewz
    protected final void Q() {
        aP().f = this.i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b8 A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01cf A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01df A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TRY_ENTER, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ec A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x021d A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0229  */
    /* JADX WARN: Code duplicated, block: B:122:0x0235 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x023a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0262  */
    /* JADX WARN: Code duplicated, block: B:128:0x0266 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x026d A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0279 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, LOOP:3: B:132:0x0277->B:133:0x0279, LOOP_END, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0291 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02b0 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02f1 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0301 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0307 A[LOOP:1: B:45:0x00aa->B:145:0x0307, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0318 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0321 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:330:0x05c9 A[Catch: IllegalStateException -> 0x076e, CryptoException -> 0x07ec, LOOP:7: B:328:0x05bc->B:330:0x05c9, LOOP_END, TryCatch #0 {IllegalStateException -> 0x076e, blocks: (B:25:0x0069, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1), top: B:458:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008f A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009b A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TRY_ENTER, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:472:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0329 A[EDGE_INSN: B:482:0x0329->B:157:0x0329 BREAK  A[LOOP:0: B:17:0x0027->B:158:0x0330], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0330 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:490:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, EDGE_INSN: B:52:0x00bd->B:148:0x0312 BREAK  A[LOOP:1: B:45:0x00aa->B:145:0x0307], TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:549:0x05e0 A[EDGE_INSN: B:549:0x05e0->B:331:0x05e0 BREAK  A[LOOP:7: B:328:0x05bc->B:330:0x05c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TRY_ENTER, TRY_LEAVE, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TRY_ENTER, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0100 A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010f A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0158 A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0169 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0183 A[Catch: IllegalStateException -> 0x079c, CryptoException -> 0x07ec, TRY_LEAVE, TryCatch #1 {CryptoException -> 0x07ec, blocks: (B:5:0x0007, B:7:0x000b, B:9:0x000f, B:11:0x0014, B:13:0x001a, B:16:0x0022, B:17:0x0027, B:19:0x0035, B:21:0x005c, B:157:0x0329, B:22:0x0064, B:25:0x0069, B:28:0x006e, B:38:0x0085, B:44:0x009b, B:45:0x00aa, B:148:0x0312, B:150:0x0318, B:151:0x031b, B:153:0x0321, B:155:0x0325, B:55:0x00c8, B:59:0x00da, B:65:0x00fa, B:76:0x0141, B:78:0x0148, B:80:0x0150, B:83:0x015f, B:85:0x0169, B:87:0x0183, B:97:0x019d, B:106:0x01c7, B:113:0x01e4, B:116:0x01ec, B:118:0x0222, B:120:0x022a, B:122:0x0235, B:124:0x023b, B:128:0x0266, B:130:0x0272, B:129:0x026d, B:133:0x0279, B:134:0x0283, B:136:0x0291, B:138:0x02cb, B:137:0x02b0, B:117:0x021d, B:112:0x01df, B:139:0x02eb, B:141:0x02f1, B:146:0x030b, B:143:0x0301, B:64:0x00f2, B:147:0x030f, B:159:0x0334, B:161:0x0339, B:162:0x0344, B:169:0x035f, B:171:0x0370, B:172:0x037d, B:174:0x0383, B:176:0x038f, B:185:0x03a1, B:187:0x03a7, B:188:0x03ac, B:189:0x03c2, B:190:0x03ca, B:191:0x03d6, B:192:0x03e2, B:194:0x03ee, B:196:0x03fb, B:197:0x0400, B:199:0x0403, B:204:0x040d, B:206:0x0412, B:208:0x0416, B:210:0x041a, B:211:0x041d, B:213:0x0423, B:215:0x0431, B:307:0x0569, B:309:0x057c, B:311:0x0581, B:313:0x0585, B:315:0x0589, B:317:0x0591, B:318:0x059c, B:321:0x05a1, B:323:0x05a5, B:324:0x05b3, B:325:0x05b7, B:328:0x05bc, B:330:0x05c9, B:331:0x05e0, B:332:0x05e2, B:333:0x05f1, B:221:0x043d, B:228:0x0455, B:230:0x045d, B:234:0x046e, B:237:0x048b, B:239:0x048f, B:241:0x0493, B:243:0x049f, B:292:0x0538, B:294:0x053e, B:299:0x054e, B:302:0x0554, B:303:0x055d, B:305:0x0562), top: B:459:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[Catch: IllegalStateException -> 0x01dc, CryptoException -> 0x077f, TRY_ENTER, TryCatch #6 {IllegalStateException -> 0x01dc, blocks: (B:32:0x007c, B:40:0x0089, B:42:0x008f, B:50:0x00b7, B:52:0x00bd, B:57:0x00ce, B:62:0x00ec, B:68:0x0100, B:70:0x010f, B:72:0x0119, B:73:0x0137, B:82:0x0158, B:90:0x0188, B:92:0x018e, B:94:0x0195, B:100:0x01b8, B:108:0x01cf), top: B:464:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [int] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r30v0, types: [ewz, fei, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v60, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v71, types: [int] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [int] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:408:0x076b -> B:307:0x0569). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:549:0x05e0
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ezf
    public void V(long r31, long r33) {
        /*
            Method dump skipped, instruction units count: 2049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fei.V(long, long):void");
    }

    @Override // defpackage.ezf
    public boolean W() {
        throw null;
    }

    @Override // defpackage.ezf
    public boolean X() {
        throw null;
    }

    @Override // defpackage.ezg
    public final int Y(defpackage.eqg eqgVar) throws defpackage.exl {
        try {
            return aa(this.m, eqgVar);
        } catch (defpackage.feo e) {
            throw h(e, eqgVar, false, 4002);
        }
    }

    protected float Z(float f, defpackage.eqg eqgVar, defpackage.eqg[] eqgVarArr) {
        throw null;
    }

    protected void aA(long j) {
        this.G = java.lang.Math.max(j, this.G);
        while (true) {
            java.util.ArrayDeque arrayDeque = this.J;
            if (arrayDeque.isEmpty() || j < ((defpackage.feh) arrayDeque.peek()).b) {
                return;
            }
            defpackage.feh fehVar = (defpackage.feh) arrayDeque.poll();
            ahvr.ci(fehVar);
            ba(fehVar);
            ak();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r3.O = null;
        aZ(null);
        an();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void aC() {
        /*
            r3 = this;
            r0 = 0
            fea r1 = r3.v     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L1a
            r1.i()     // Catch: java.lang.Throwable -> L2c
            exc r1 = r3.F     // Catch: java.lang.Throwable -> L2c
            int r2 = r1.b     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 + 1
            r1.b = r2     // Catch: java.lang.Throwable -> L2c
            fee r1 = r3.y     // Catch: java.lang.Throwable -> L2c
            ahvr.ci(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.b     // Catch: java.lang.Throwable -> L2c
            r3.ah(r1)     // Catch: java.lang.Throwable -> L2c
        L1a:
            r3.v = r0
            android.media.MediaCrypto r1 = r3.O     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L23
            r1.release()     // Catch: java.lang.Throwable -> L3f
        L23:
            r3.O = r0
            r3.aZ(r0)
            r3.an()
            return
        L2c:
            r1 = move-exception
            r3.v = r0
            android.media.MediaCrypto r2 = r3.O     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L36
            r2.release()     // Catch: java.lang.Throwable -> L3f
        L36:
            r3.O = r0
            r3.aZ(r0)
            r3.an()
            throw r1
        L3f:
            r1 = move-exception
            r3.O = r0
            r3.aZ(r0)
            r3.an()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fei.aC():void");
    }

    public final void aD() {
        bc(this.w);
    }

    public final boolean aE() {
        return this.Y >= 0;
    }

    protected final boolean aF(defpackage.eqg eqgVar) {
        return this.N == null && ap(eqgVar);
    }

    protected boolean aG(defpackage.ewu ewuVar) {
        return false;
    }

    protected boolean aH() {
        return this.B;
    }

    protected boolean aI(defpackage.fee feeVar) {
        return true;
    }

    protected boolean aJ() {
        return false;
    }

    protected boolean aK() {
        int i = this.ah;
        if (i == 3) {
            return true;
        }
        if (i == 2) {
            try {
                bd();
            } catch (defpackage.exl e) {
                defpackage.etr.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    protected final void aM() throws java.lang.Throwable {
        if (bf()) {
            az();
        }
    }

    protected abstract int aa(defpackage.fek fekVar, defpackage.eqg eqgVar);

    protected long ab(long j, long j2, boolean z) {
        throw null;
    }

    protected defpackage.exd ac(defpackage.fee feeVar, defpackage.eqg eqgVar, defpackage.eqg eqgVar2, boolean z) {
        throw null;
    }

    protected abstract java.util.List ad(defpackage.fek fekVar, defpackage.eqg eqgVar, boolean z);

    protected void ae(defpackage.ewu ewuVar) {
        throw null;
    }

    protected void af(java.lang.Exception exc) {
        throw null;
    }

    protected abstract void ag(defpackage.exa exaVar);

    protected void ah(java.lang.String str) {
        throw null;
    }

    protected void ai(defpackage.eqg eqgVar, android.media.MediaFormat mediaFormat) {
        throw null;
    }

    protected void al() {
        throw null;
    }

    protected void am() {
        aX();
        aY();
        aW();
        this.z = -9223372036854775807L;
        this.ai = false;
        this.V = -9223372036854775807L;
        this.B = false;
        this.ab = false;
        this.aa = false;
        this.ag = 0;
        this.ah = 0;
        this.af = this.ae ? 1 : 0;
        this.ao = false;
        this.H = 0L;
        this.ap = -9223372036854775807L;
    }

    protected void an() {
        am();
        this.E = null;
        this.S = null;
        this.y = null;
        this.w = null;
        this.x = null;
        this.Q = false;
        this.R = -1.0f;
        this.U = false;
        this.W = false;
        this.ae = false;
        this.af = 0;
    }

    protected abstract boolean ao(long j, long j2, defpackage.fea feaVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, defpackage.eqg eqgVar);

    protected boolean ap(defpackage.eqg eqgVar) {
        return false;
    }

    protected void aq(java.lang.String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0175  */
    /* JADX WARN: Code duplicated, block: B:102:0x0179  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0160  */
    /* JADX WARN: Code duplicated, block: B:94:0x0168  */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    /* JADX WARN: Code duplicated, block: B:96:0x016c  */
    /* JADX WARN: Code duplicated, block: B:97:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [fcs, java.lang.Object] */
    protected defpackage.exd ar(defpackage.hiz hizVar) throws java.lang.Throwable {
        defpackage.fcs fcsVar;
        defpackage.fcs fcsVar2;
        defpackage.exd exdVarAc;
        int i;
        int i2;
        defpackage.exd exdVar;
        defpackage.fdb fdbVarM;
        defpackage.fdb fdbVarM2;
        java.lang.String str;
        android.util.Pair pairA;
        this.al = true;
        java.lang.Object eqgVar = hizVar.a;
        ahvr.ci(eqgVar);
        defpackage.eqg eqgVar2 = (defpackage.eqg) eqgVar;
        java.lang.String str2 = eqgVar2.p;
        if (str2 == null) {
            throw h(new java.lang.IllegalArgumentException("Sample MIME type is null."), eqgVar2, false, 4005);
        }
        if (j$.util.Objects.equals(str2, "video/av01") || j$.util.Objects.equals(str2, "video/x-vnd.on2.vp9") || j$.util.Objects.equals(str2, "audio/eac3") || j$.util.Objects.equals(str2, "audio/eac3-joc")) {
            if (!eqgVar2.s.isEmpty()) {
                defpackage.eqf eqfVar = new defpackage.eqf(eqgVar2);
                eqfVar.q = null;
                eqgVar = new defpackage.eqg(eqfVar);
            }
        } else if (j$.util.Objects.equals(str2, "video/dolby-vision")) {
            byte[] bArr = defpackage.ete.a;
            if (!j$.util.Objects.equals(str2, "video/dolby-vision") || (pairA = defpackage.ete.a(eqgVar2)) == null) {
                str = null;
            } else {
                int iIntValue = ((java.lang.Integer) pairA.first).intValue();
                if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                    str = "video/hevc";
                } else if (iIntValue == 512) {
                    str = "video/avc";
                } else if (iIntValue != 1024) {
                    str = null;
                } else {
                    str = "video/av01";
                }
            }
            if (j$.util.Objects.equals(str, "video/av01")) {
                if (!eqgVar2.s.isEmpty()) {
                    defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar2);
                    eqfVar2.q = null;
                    eqgVar = new defpackage.eqg(eqfVar2);
                }
            }
        }
        bb(hizVar.b);
        defpackage.eqg eqgVar3 = (defpackage.eqg) eqgVar;
        this.t = eqgVar3;
        if (this.A) {
            this.ad = true;
            return null;
        }
        defpackage.fea feaVar = this.v;
        if (feaVar == null) {
            this.S = null;
            az();
            return null;
        }
        defpackage.fee feeVar = this.y;
        ahvr.ci(feeVar);
        defpackage.eqg eqgVar4 = this.w;
        ahvr.ci(eqgVar4);
        defpackage.fcs fcsVar3 = this.M;
        defpackage.fcs fcsVar4 = this.N;
        if (fcsVar3 == fcsVar4) {
            fcsVar = this.N;
            fcsVar2 = this.M;
            exdVarAc = ac(feeVar, eqgVar4, eqgVar3, aP().h);
            i = exdVarAc.d;
            if (i != 0) {
                if (i != 1) {
                    bc(eqgVar3);
                    this.w = eqgVar3;
                    if (fcsVar != fcsVar2) {
                        if (!be()) {
                            i2 = 2;
                        }
                    } else if (this.B) {
                        this.ag = 1;
                        if (aK()) {
                            this.ah = 3;
                            i2 = 2;
                        } else {
                            this.ah = 1;
                        }
                    }
                } else if (i != 2) {
                    bc(eqgVar3);
                    this.w = eqgVar3;
                    if (fcsVar == fcsVar2 && !be()) {
                        i2 = 2;
                    }
                } else {
                    bc(eqgVar3);
                    this.ae = true;
                    this.af = 1;
                    this.w = eqgVar3;
                    if (fcsVar == fcsVar2 && !be()) {
                        i2 = 2;
                    }
                }
                if (i != 0) {
                    return exdVarAc;
                }
                if (this.v != feaVar && this.ah != 3) {
                    return exdVarAc;
                }
                exdVar = new defpackage.exd(feeVar.b, eqgVar4, eqgVar3, 0, i2);
            } else {
                aR();
            }
            i2 = 0;
            if (i != 0) {
                return exdVarAc;
            }
            if (this.v != feaVar) {
            }
            exdVar = new defpackage.exd(feeVar.b, eqgVar4, eqgVar3, 0, i2);
        } else {
            if (fcsVar4 != null && fcsVar3 != null && (fdbVarM = fcsVar4.m()) != null && (fdbVarM2 = fcsVar3.m()) != null && fdbVarM.getClass().equals(fdbVarM2.getClass()) && fcsVar4.c().equals(fcsVar3.c())) {
                java.util.UUID uuid = defpackage.epx.e;
                if (!uuid.equals(fcsVar3.c()) && !uuid.equals(fcsVar4.c())) {
                    if (!feeVar.g) {
                        if (fcsVar4.a() != 2) {
                            if (fcsVar4.a() == 3 || fcsVar4.a() == 4) {
                                java.lang.String str3 = eqgVar3.p;
                                ahvr.ci(str3);
                                if (!fcsVar4.l(str3)) {
                                }
                            }
                        }
                    }
                    fcsVar = this.N;
                    fcsVar2 = this.M;
                    exdVarAc = ac(feeVar, eqgVar4, eqgVar3, aP().h);
                    i = exdVarAc.d;
                    if (i != 0) {
                        if (i != 1) {
                            bc(eqgVar3);
                            this.w = eqgVar3;
                            if (fcsVar != fcsVar2) {
                                if (!be()) {
                                    i2 = 2;
                                }
                            } else if (this.B) {
                                this.ag = 1;
                                if (aK()) {
                                    this.ah = 3;
                                    i2 = 2;
                                } else {
                                    this.ah = 1;
                                }
                            }
                        } else if (i != 2) {
                            bc(eqgVar3);
                            this.w = eqgVar3;
                            if (fcsVar == fcsVar2) {
                            }
                        } else {
                            bc(eqgVar3);
                            this.ae = true;
                            this.af = 1;
                            this.w = eqgVar3;
                            if (fcsVar == fcsVar2) {
                            }
                        }
                        if (i != 0) {
                            return exdVarAc;
                        }
                        if (this.v != feaVar) {
                        }
                        exdVar = new defpackage.exd(feeVar.b, eqgVar4, eqgVar3, 0, i2);
                    } else {
                        aR();
                    }
                    i2 = 0;
                    if (i != 0) {
                        return exdVarAc;
                    }
                    if (this.v != feaVar) {
                    }
                    exdVar = new defpackage.exd(feeVar.b, eqgVar4, eqgVar3, 0, i2);
                }
            }
            aR();
            exdVar = new defpackage.exd(feeVar.b, eqgVar4, eqgVar3, 0, 128);
        }
        return exdVar;
    }

    protected abstract defpackage.klt as(defpackage.fee feeVar, defpackage.eqg eqgVar, android.media.MediaCrypto mediaCrypto, float f);

    protected int at(defpackage.ewu ewuVar) {
        return 0;
    }

    protected final long au() {
        return this.am.i;
    }

    protected final long av() {
        return this.am.d;
    }

    protected final long aw() {
        return this.am.c;
    }

    protected defpackage.fec ax(java.lang.Throwable th, defpackage.fee feeVar) {
        return new defpackage.fec(th, feeVar);
    }

    protected final void ay(android.media.MediaFormat mediaFormat) {
        for (java.util.Map.Entry entry : this.aq.b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof java.lang.Integer) {
                mediaFormat.setInteger(str, ((java.lang.Integer) value).intValue());
            } else if (value instanceof java.lang.Long) {
                mediaFormat.setLong(str, ((java.lang.Long) value).longValue());
            } else if (value instanceof java.lang.Float) {
                mediaFormat.setFloat(str, ((java.lang.Float) value).floatValue());
            } else if (value instanceof java.lang.String) {
                mediaFormat.setString(str, (java.lang.String) value);
            } else if (value instanceof java.nio.ByteBuffer) {
                mediaFormat.setByteBuffer(str, (java.nio.ByteBuffer) value);
            }
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:255:0x02a9 */
    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:107:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x0236  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b A[Catch: Exception -> 0x0287, all -> 0x03b2, TryCatch #19 {all -> 0x03b2, blocks: (B:137:0x02b5, B:138:0x02ca, B:140:0x02d1, B:142:0x02d7, B:146:0x02e2, B:147:0x0304, B:85:0x019c, B:86:0x01c0, B:87:0x01cb, B:93:0x01e2, B:94:0x01f1, B:95:0x0208, B:97:0x020f, B:99:0x0217, B:101:0x021d, B:103:0x0222, B:105:0x022c, B:109:0x0238, B:111:0x027b, B:113:0x027f, B:114:0x0282, B:127:0x029d, B:132:0x02a9, B:131:0x02a6, B:128:0x02a1, B:90:0x01d2, B:92:0x01da), top: B:260:0x02b5, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0324 A[Catch: Exception -> 0x03a9, TryCatch #8 {Exception -> 0x03a9, blocks: (B:148:0x0311, B:150:0x0324, B:151:0x0339, B:153:0x0349, B:155:0x0353, B:159:0x035b, B:161:0x0366, B:162:0x0372, B:164:0x0384, B:166:0x038c), top: B:243:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0349 A[Catch: Exception -> 0x03a9, TryCatch #8 {Exception -> 0x03a9, blocks: (B:148:0x0311, B:150:0x0324, B:151:0x0339, B:153:0x0349, B:155:0x0353, B:159:0x035b, B:161:0x0366, B:162:0x0372, B:164:0x0384, B:166:0x038c), top: B:243:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0359  */
    /* JADX WARN: Code duplicated, block: B:161:0x0366 A[Catch: Exception -> 0x03a9, TryCatch #8 {Exception -> 0x03a9, blocks: (B:148:0x0311, B:150:0x0324, B:151:0x0339, B:153:0x0349, B:155:0x0353, B:159:0x035b, B:161:0x0366, B:162:0x0372, B:164:0x0384, B:166:0x038c), top: B:243:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0384 A[Catch: Exception -> 0x03a9, TryCatch #8 {Exception -> 0x03a9, blocks: (B:148:0x0311, B:150:0x0324, B:151:0x0339, B:153:0x0349, B:155:0x0353, B:159:0x035b, B:161:0x0366, B:162:0x0372, B:164:0x0384, B:166:0x038c), top: B:243:0x0311 }] */
    /* JADX WARN: Code duplicated, block: B:203:0x0414 A[Catch: feg -> 0x048c, TryCatch #11 {feg -> 0x048c, blocks: (B:201:0x03df, B:203:0x0414, B:205:0x0420, B:207:0x0437, B:209:0x0457, B:213:0x0468, B:214:0x046a, B:208:0x043a, B:215:0x046b, B:222:0x0482, B:223:0x048b), top: B:248:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x041e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0437 A[Catch: feg -> 0x048c, TryCatch #11 {feg -> 0x048c, blocks: (B:201:0x03df, B:203:0x0414, B:205:0x0420, B:207:0x0437, B:209:0x0457, B:213:0x0468, B:214:0x046a, B:208:0x043a, B:215:0x046b, B:222:0x0482, B:223:0x048b), top: B:248:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:208:0x043a A[Catch: feg -> 0x048c, TryCatch #11 {feg -> 0x048c, blocks: (B:201:0x03df, B:203:0x0414, B:205:0x0420, B:207:0x0437, B:209:0x0457, B:213:0x0468, B:214:0x046a, B:208:0x043a, B:215:0x046b, B:222:0x0482, B:223:0x048b), top: B:248:0x00f0 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x045d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0468 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:83:0x018e A[Catch: all -> 0x02aa, TRY_LEAVE, TryCatch #12 {all -> 0x02aa, blocks: (B:81:0x0182, B:83:0x018e), top: B:249:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2 A[Catch: Exception -> 0x028e, all -> 0x03b2, TryCatch #2 {Exception -> 0x028e, blocks: (B:87:0x01cb, B:93:0x01e2, B:94:0x01f1, B:90:0x01d2, B:92:0x01da), top: B:233:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01da A[Catch: Exception -> 0x028e, all -> 0x03b2, TryCatch #2 {Exception -> 0x028e, blocks: (B:87:0x01cb, B:93:0x01e2, B:94:0x01f1, B:90:0x01d2, B:92:0x01da), top: B:233:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:97:0x020f A[Catch: Exception -> 0x0289, all -> 0x03b2, TryCatch #7 {Exception -> 0x0289, blocks: (B:95:0x0208, B:97:0x020f, B:99:0x0217, B:101:0x021d, B:103:0x0222), top: B:241:0x0208 }] */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void az() throws java.lang.Throwable {
        defpackage.eqg eqgVar;
        boolean z;
        java.util.ArrayDeque arrayDeque;
        int i;
        boolean z2;
        defpackage.feg fegVar;
        java.lang.String diagnosticInfo;
        android.media.MediaCrypto mediaCrypto;
        defpackage.eqg eqgVar2;
        defpackage.feg fegVar2;
        defpackage.fdq fdqVar;
        java.lang.Object obj;
        java.lang.Exception exc;
        defpackage.fdr fdrVar;
        android.media.MediaCodec mediaCodecCreateByCodecName;
        java.lang.Object obj2;
        defpackage.feb fesVar;
        int i2;
        defpackage.fdr fdrVar2;
        java.lang.Object obj3;
        int i3;
        defpackage.fdv fdvVar;
        android.media.MediaCodec mediaCodec;
        boolean z3;
        defpackage.hjx hjxVar;
        defpackage.fea ferVar;
        boolean z4;
        android.media.MediaCodec mediaCodecCreateByCodecName2;
        java.lang.Object obj4;
        android.media.MediaCrypto mediaCrypto2;
        if (this.v != null || this.A || (eqgVar = this.t) == null) {
            return;
        }
        if (aF(eqgVar)) {
            aQ();
            java.lang.String str = eqgVar.p;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.p.j = 32;
            } else {
                this.p.j = 1;
            }
            this.A = true;
            return;
        }
        aZ(this.N);
        java.lang.Object obj5 = null;
        if (this.M != null && !bg()) {
            mediaCrypto2 = obj5;
            break;
        }
        int i4 = 0;
        try {
            defpackage.fcs fcsVar = this.M;
            if (fcsVar == null || !(fcsVar.a() == 3 || this.M.a() == 4)) {
                z = false;
            } else {
                defpackage.fcs fcsVar2 = this.M;
                java.lang.String str2 = eqgVar.p;
                ahvr.ci(str2);
                if (fcsVar2.l(str2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            android.media.MediaCrypto mediaCrypto3 = this.O;
            defpackage.eqg eqgVar3 = this.t;
            ahvr.ci(eqgVar3);
            java.lang.String str3 = "MediaCodecRenderer";
            if (this.S == null) {
                try {
                    defpackage.eqg eqgVar4 = this.t;
                    ahvr.ci(eqgVar4);
                    defpackage.fek fekVar = this.m;
                    java.util.List listAd = ad(fekVar, eqgVar4, z);
                    if (listAd.isEmpty() && z) {
                        listAd = ad(fekVar, eqgVar4, false);
                        if (!listAd.isEmpty()) {
                            defpackage.etr.f("MediaCodecRenderer", "Drm session requires secure decoder for " + eqgVar4.p + ", but no secure decoder available. Trying to proceed with " + listAd.toString() + '.');
                        }
                    }
                    this.S = new java.util.ArrayDeque();
                    if (!listAd.isEmpty()) {
                        this.S.add((defpackage.fee) listAd.get(0));
                    }
                    this.T = null;
                } catch (defpackage.feo e) {
                    throw new defpackage.feg(eqgVar3, e, z, -49998);
                }
            }
            try {
                if (!this.S.isEmpty()) {
                    java.util.ArrayDeque arrayDeque2 = this.S;
                    ahvr.ci(arrayDeque2);
                    while (true) {
                        if (this.v != null) {
                            java.util.ArrayDeque arrayDeque3 = obj5;
                            this.S = arrayDeque3;
                            mediaCrypto2 = arrayDeque3;
                            break;
                        }
                        defpackage.fee feeVar = (defpackage.fee) arrayDeque2.peekFirst();
                        ahvr.ci(feeVar);
                        aN(eqgVar3);
                        if (!aI(feeVar)) {
                            mediaCrypto2 = obj5;
                            break;
                        }
                        try {
                            this.y = feeVar;
                            defpackage.eqg eqgVar5 = this.t;
                            ahvr.ci(eqgVar5);
                            java.util.ArrayDeque arrayDeque4 = arrayDeque2;
                            try {
                                java.lang.String str4 = feeVar.b;
                                float fZ = Z(this.P, eqgVar5, N());
                                if (fZ <= 0.0f) {
                                    fZ = -1.0f;
                                }
                                g();
                                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                                defpackage.klt kltVarAs = as(feeVar, eqgVar5, mediaCrypto3, fZ);
                                i = i4;
                                try {
                                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                                        try {
                                            android.media.metrics.LogSessionId logSessionIdA = k().a();
                                            if (!mp$.ExternalSyntheticApiModelOutline0.m(logSessionIdA, mp$.ExternalSyntheticApiModelOutline0.m())) {
                                                ((android.media.MediaFormat) kltVarAs.e).setString("log-session-id", mp$.ExternalSyntheticApiModelOutline0.m(logSessionIdA));
                                            }
                                        } catch (java.lang.Exception e2) {
                                            e = e2;
                                            str3 = str3;
                                            feeVar = feeVar;
                                            arrayDeque = arrayDeque4;
                                            java.lang.String str5 = feeVar.b;
                                            defpackage.etr.g(str3, "Failed to initialize decoder: ".concat(str5), e);
                                            arrayDeque.removeFirst();
                                            z2 = z;
                                            java.lang.String str6 = "Decoder init failed: " + str5 + ", " + eqgVar3.toString();
                                            java.lang.String str7 = eqgVar3.p;
                                            if (e instanceof android.media.MediaCodec.CodecException) {
                                                diagnosticInfo = ((android.media.MediaCodec.CodecException) e).getDiagnosticInfo();
                                            } else {
                                                diagnosticInfo = null;
                                            }
                                            mediaCrypto = mediaCrypto3;
                                            eqgVar2 = eqgVar3;
                                            fegVar = new defpackage.feg(str6, e, str7, z2, feeVar, diagnosticInfo);
                                            af(fegVar);
                                            fegVar2 = this.T;
                                            if (fegVar2 == null) {
                                                this.T = fegVar;
                                            } else {
                                                this.T = new defpackage.feg(fegVar2.getMessage(), fegVar2.getCause(), fegVar2.a, fegVar2.b, fegVar2.c, fegVar2.d);
                                            }
                                            if (!arrayDeque.isEmpty()) {
                                                throw this.T;
                                            }
                                            mediaCrypto3 = mediaCrypto;
                                            eqgVar3 = eqgVar2;
                                            str3 = str3;
                                            z = z2;
                                            i4 = i;
                                            arrayDeque2 = arrayDeque;
                                            obj5 = null;
                                        }
                                    }
                                    try {
                                        android.os.Trace.beginSection(a.bx(str4, "createCodec:"));
                                        defpackage.fdz fdzVar = this.l;
                                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                                            int iB = defpackage.eqz.b(((defpackage.eqg) kltVarAs.f).p);
                                            arrayDeque = arrayDeque4;
                                            defpackage.etr.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(eum.K(iB)));
                                            fdqVar = new defpackage.fdq(iB);
                                            boolean z5 = ((defpackage.fdx) fdzVar).b;
                                            fdqVar.c = true;
                                            obj = kltVarAs.c;
                                            java.lang.String str8 = ((defpackage.fee) obj).b;
                                            try {
                                                android.os.Trace.beginSection(a.bx(str8, "createCodec:"));
                                                mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str8);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (fdqVar.c) {
                                                                        obj2 = obj;
                                                                        if (android.os.Build.VERSION.SDK_INT >= 36) {
                                                                            fesVar = new defpackage.fes(mediaCodecCreateByCodecName);
                                                                            i2 = 4;
                                                                        }
                                                                        fdrVar2 = new defpackage.fdr(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.a.eZ(), fesVar, (defpackage.hjx) kltVarAs.a);
                                                                        android.os.Trace.endSection();
                                                                        obj3 = kltVarAs.d;
                                                                        if (obj3 == null || !((defpackage.fee) obj2).i || android.os.Build.VERSION.SDK_INT < 35) {
                                                                            i3 = i2;
                                                                        } else {
                                                                            i3 = i2 | 8;
                                                                        }
                                                                        java.lang.Object obj6 = kltVarAs.e;
                                                                        java.lang.Object obj7 = kltVarAs.b;
                                                                        fdvVar = fdrVar2.b;
                                                                        mediaCodec = fdrVar2.a;
                                                                        if (fdvVar.c == null) {
                                                                            z3 = 1;
                                                                        } else {
                                                                            z3 = i;
                                                                        }
                                                                        ahvr.bY(z3);
                                                                        android.os.HandlerThread handlerThread = fdvVar.b;
                                                                        handlerThread.start();
                                                                        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                                                                        mediaCodec.setCallback(fdvVar, handler);
                                                                        fdvVar.c = handler;
                                                                        android.os.Trace.beginSection("configureCodec");
                                                                        mediaCodec.configure((android.media.MediaFormat) obj6, (android.view.Surface) obj3, (android.media.MediaCrypto) obj7, i3);
                                                                        android.os.Trace.endSection();
                                                                        fdrVar2.c.e();
                                                                        android.os.Trace.beginSection("startCodec");
                                                                        mediaCodec.start();
                                                                        android.os.Trace.endSection();
                                                                        if (android.os.Build.VERSION.SDK_INT >= 35 && (hjxVar = fdrVar2.e) != null) {
                                                                            hjxVar.c(mediaCodec);
                                                                        }
                                                                        fdrVar2.d = 1;
                                                                        ferVar = fdrVar2;
                                                                        this.v = ferVar;
                                                                        this.W = ferVar.t(new rai(this));
                                                                        android.os.Trace.endSection();
                                                                        g();
                                                                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                                                                        if (!feeVar.e(this.k, eqgVar5)) {
                                                                            java.lang.Object[] objArr = new java.lang.Object[2];
                                                                            objArr[i] = defpackage.eqg.c(eqgVar5);
                                                                            objArr[1] = str4;
                                                                            defpackage.etr.f(str3, eum.G("Format exceeds selected codec's capabilities [%s, %s]", objArr));
                                                                        }
                                                                        this.R = fZ;
                                                                        this.w = eqgVar5;
                                                                        int i5 = defpackage.equ.a;
                                                                        if (!android.os.Build.MANUFACTURER.equals("Amazon") && android.os.Build.MODEL.equals("AFTS") && feeVar.g) {
                                                                            z4 = 1;
                                                                        } else {
                                                                            z4 = i;
                                                                        }
                                                                        this.U = z4;
                                                                        ahvr.ci(this.v);
                                                                        if (this.b == 2) {
                                                                            g();
                                                                            this.z = android.os.SystemClock.elapsedRealtime() + 1000;
                                                                        }
                                                                        this.F.a++;
                                                                        long j = jElapsedRealtime2 - jElapsedRealtime;
                                                                        if (android.os.Build.VERSION.SDK_INT >= 31 && !this.as.isEmpty()) {
                                                                            defpackage.fea feaVar = this.v;
                                                                            ahvr.ci(feaVar);
                                                                            feaVar.n(new java.util.ArrayList((java.util.Collection) this.as));
                                                                        }
                                                                        str3 = str3;
                                                                        feeVar = feeVar;
                                                                        aq(str4, jElapsedRealtime2, j);
                                                                        str3 = str3;
                                                                    } else {
                                                                        obj2 = obj;
                                                                    }
                                                                    aq(str4, jElapsedRealtime2, j);
                                                                    str3 = str3;
                                                                } catch (java.lang.Exception e3) {
                                                                    e = e3;
                                                                    java.lang.String str9 = feeVar.b;
                                                                    defpackage.etr.g(str3, "Failed to initialize decoder: ".concat(str9), e);
                                                                    arrayDeque.removeFirst();
                                                                    z2 = z;
                                                                    java.lang.String str10 = "Decoder init failed: " + str9 + ", " + eqgVar3.toString();
                                                                    java.lang.String str11 = eqgVar3.p;
                                                                    if (e instanceof android.media.MediaCodec.CodecException) {
                                                                        diagnosticInfo = ((android.media.MediaCodec.CodecException) e).getDiagnosticInfo();
                                                                    } else {
                                                                        diagnosticInfo = null;
                                                                    }
                                                                    mediaCrypto = mediaCrypto3;
                                                                    eqgVar2 = eqgVar3;
                                                                    fegVar = new defpackage.feg(str10, e, str11, z2, feeVar, diagnosticInfo);
                                                                    af(fegVar);
                                                                    fegVar2 = this.T;
                                                                    if (fegVar2 == null) {
                                                                        this.T = fegVar;
                                                                    } else {
                                                                        this.T = new defpackage.feg(fegVar2.getMessage(), fegVar2.getCause(), fegVar2.a, fegVar2.b, fegVar2.c, fegVar2.d);
                                                                    }
                                                                    if (!arrayDeque.isEmpty()) {
                                                                        throw this.T;
                                                                    }
                                                                    mediaCrypto3 = mediaCrypto;
                                                                    eqgVar3 = eqgVar2;
                                                                    str3 = str3;
                                                                    z = z2;
                                                                }
                                                                android.os.Trace.endSection();
                                                                g();
                                                                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                                                                if (!feeVar.e(this.k, eqgVar5)) {
                                                                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                                                                    objArr2[i] = defpackage.eqg.c(eqgVar5);
                                                                    objArr2[1] = str4;
                                                                    defpackage.etr.f(str3, eum.G("Format exceeds selected codec's capabilities [%s, %s]", objArr2));
                                                                }
                                                                this.R = fZ;
                                                                this.w = eqgVar5;
                                                                int i6 = defpackage.equ.a;
                                                                if (!android.os.Build.MANUFACTURER.equals("Amazon")) {
                                                                    z4 = i;
                                                                } else {
                                                                    z4 = i;
                                                                }
                                                                this.U = z4;
                                                                ahvr.ci(this.v);
                                                                if (this.b == 2) {
                                                                    g();
                                                                    this.z = android.os.SystemClock.elapsedRealtime() + 1000;
                                                                }
                                                                this.F.a++;
                                                                long j2 = jElapsedRealtime3 - jElapsedRealtime;
                                                                if (android.os.Build.VERSION.SDK_INT >= 31) {
                                                                    defpackage.fea feaVar2 = this.v;
                                                                    ahvr.ci(feaVar2);
                                                                    feaVar2.n(new java.util.ArrayList((java.util.Collection) this.as));
                                                                }
                                                                str3 = str3;
                                                                feeVar = feeVar;
                                                            } catch (java.lang.Exception e4) {
                                                                e = e4;
                                                                str3 = str3;
                                                                feeVar = feeVar;
                                                                java.lang.String str12 = feeVar.b;
                                                                defpackage.etr.g(str3, "Failed to initialize decoder: ".concat(str12), e);
                                                                arrayDeque.removeFirst();
                                                                z2 = z;
                                                                java.lang.String str13 = "Decoder init failed: " + str12 + ", " + eqgVar3.toString();
                                                                java.lang.String str14 = eqgVar3.p;
                                                                if (e instanceof android.media.MediaCodec.CodecException) {
                                                                    diagnosticInfo = ((android.media.MediaCodec.CodecException) e).getDiagnosticInfo();
                                                                } else {
                                                                    diagnosticInfo = null;
                                                                }
                                                                mediaCrypto = mediaCrypto3;
                                                                eqgVar2 = eqgVar3;
                                                                fegVar = new defpackage.feg(str13, e, str14, z2, feeVar, diagnosticInfo);
                                                                af(fegVar);
                                                                fegVar2 = this.T;
                                                                if (fegVar2 == null) {
                                                                    this.T = fegVar;
                                                                } else {
                                                                    this.T = new defpackage.feg(fegVar2.getMessage(), fegVar2.getCause(), fegVar2.a, fegVar2.b, fegVar2.c, fegVar2.d);
                                                                }
                                                                if (!arrayDeque.isEmpty()) {
                                                                    throw this.T;
                                                                }
                                                                mediaCrypto3 = mediaCrypto;
                                                                eqgVar3 = eqgVar2;
                                                                str3 = str3;
                                                                z = z2;
                                                            }
                                                            mediaCodec = fdrVar2.a;
                                                            if (fdvVar.c == null) {
                                                                z3 = 1;
                                                            } else {
                                                                z3 = i;
                                                            }
                                                            ahvr.bY(z3);
                                                            android.os.HandlerThread handlerThread2 = fdvVar.b;
                                                            handlerThread2.start();
                                                            android.os.Handler handler2 = new android.os.Handler(handlerThread2.getLooper());
                                                            mediaCodec.setCallback(fdvVar, handler2);
                                                            fdvVar.c = handler2;
                                                            android.os.Trace.beginSection("configureCodec");
                                                            mediaCodec.configure((android.media.MediaFormat) obj6, (android.view.Surface) obj3, (android.media.MediaCrypto) obj7, i3);
                                                            android.os.Trace.endSection();
                                                            fdrVar2.c.e();
                                                            android.os.Trace.beginSection("startCodec");
                                                            mediaCodec.start();
                                                            android.os.Trace.endSection();
                                                            if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                                hjxVar.c(mediaCodec);
                                                            }
                                                            fdrVar2.d = 1;
                                                            ferVar = fdrVar2;
                                                            this.v = ferVar;
                                                            this.W = ferVar.t(new rai(this));
                                                        } catch (java.lang.Exception e5) {
                                                            e = e5;
                                                            exc = e;
                                                            fdrVar = fdrVar2;
                                                            try {
                                                                if (fdrVar != null) {
                                                                    fdrVar.i();
                                                                } else if (mediaCodecCreateByCodecName != null) {
                                                                    mediaCodecCreateByCodecName.release();
                                                                }
                                                            } catch (java.lang.RuntimeException e6) {
                                                                exc.addSuppressed(e6);
                                                            }
                                                            throw exc;
                                                        }
                                                        android.os.Trace.endSection();
                                                        obj3 = kltVarAs.d;
                                                        if (obj3 == null) {
                                                            i3 = i2;
                                                        } else {
                                                            i3 = i2;
                                                        }
                                                        java.lang.Object obj8 = kltVarAs.e;
                                                        java.lang.Object obj9 = kltVarAs.b;
                                                        fdvVar = fdrVar2.b;
                                                    } catch (java.lang.Exception e7) {
                                                        e = e7;
                                                    }
                                                    fesVar = new defpackage.fdu(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.b.eZ());
                                                    i2 = i;
                                                    fdrVar2 = new defpackage.fdr(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.a.eZ(), fesVar, (defpackage.hjx) kltVarAs.a);
                                                } catch (java.lang.Exception e8) {
                                                    mediaCodecCreateByCodecName = mediaCodecCreateByCodecName;
                                                    exc = e8;
                                                    fdrVar = null;
                                                }
                                            } catch (java.lang.Exception e9) {
                                                exc = e9;
                                                fdrVar = null;
                                                mediaCodecCreateByCodecName = null;
                                            }
                                        } else {
                                            android.content.Context context = ((defpackage.fdx) fdzVar).a;
                                            try {
                                                try {
                                                    try {
                                                        if (context != null) {
                                                            try {
                                                                if (context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")) {
                                                                    int iB2 = defpackage.eqz.b(((defpackage.eqg) kltVarAs.f).p);
                                                                    arrayDeque = arrayDeque4;
                                                                    defpackage.etr.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(eum.K(iB2)));
                                                                    fdqVar = new defpackage.fdq(iB2);
                                                                    boolean z6 = ((defpackage.fdx) fdzVar).b;
                                                                    fdqVar.c = true;
                                                                    obj = kltVarAs.c;
                                                                    java.lang.String str15 = ((defpackage.fee) obj).b;
                                                                    android.os.Trace.beginSection(a.bx(str15, "createCodec:"));
                                                                    mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str15);
                                                                    if (fdqVar.c) {
                                                                        obj2 = obj;
                                                                    } else {
                                                                        obj2 = obj;
                                                                        if (android.os.Build.VERSION.SDK_INT >= 36) {
                                                                            fesVar = new defpackage.fes(mediaCodecCreateByCodecName);
                                                                            i2 = 4;
                                                                        }
                                                                        fdrVar2 = new defpackage.fdr(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.a.eZ(), fesVar, (defpackage.hjx) kltVarAs.a);
                                                                        android.os.Trace.endSection();
                                                                        obj3 = kltVarAs.d;
                                                                        if (obj3 == null) {
                                                                            i3 = i2;
                                                                        } else {
                                                                            i3 = i2;
                                                                        }
                                                                        java.lang.Object obj10 = kltVarAs.e;
                                                                        java.lang.Object obj11 = kltVarAs.b;
                                                                        fdvVar = fdrVar2.b;
                                                                        mediaCodec = fdrVar2.a;
                                                                        if (fdvVar.c == null) {
                                                                            z3 = 1;
                                                                        } else {
                                                                            z3 = i;
                                                                        }
                                                                        ahvr.bY(z3);
                                                                        android.os.HandlerThread handlerThread3 = fdvVar.b;
                                                                        handlerThread3.start();
                                                                        android.os.Handler handler3 = new android.os.Handler(handlerThread3.getLooper());
                                                                        mediaCodec.setCallback(fdvVar, handler3);
                                                                        fdvVar.c = handler3;
                                                                        android.os.Trace.beginSection("configureCodec");
                                                                        mediaCodec.configure((android.media.MediaFormat) obj10, (android.view.Surface) obj3, (android.media.MediaCrypto) obj11, i3);
                                                                        android.os.Trace.endSection();
                                                                        fdrVar2.c.e();
                                                                        android.os.Trace.beginSection("startCodec");
                                                                        mediaCodec.start();
                                                                        android.os.Trace.endSection();
                                                                        if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                                            hjxVar.c(mediaCodec);
                                                                        }
                                                                        fdrVar2.d = 1;
                                                                        ferVar = fdrVar2;
                                                                    }
                                                                    fesVar = new defpackage.fdu(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.b.eZ());
                                                                    i2 = i;
                                                                    fdrVar2 = new defpackage.fdr(mediaCodecCreateByCodecName, (android.os.HandlerThread) fdqVar.a.eZ(), fesVar, (defpackage.hjx) kltVarAs.a);
                                                                    android.os.Trace.endSection();
                                                                    obj3 = kltVarAs.d;
                                                                    if (obj3 == null) {
                                                                        i3 = i2;
                                                                    } else {
                                                                        i3 = i2;
                                                                    }
                                                                    java.lang.Object obj12 = kltVarAs.e;
                                                                    java.lang.Object obj13 = kltVarAs.b;
                                                                    fdvVar = fdrVar2.b;
                                                                    mediaCodec = fdrVar2.a;
                                                                    if (fdvVar.c == null) {
                                                                        z3 = 1;
                                                                    } else {
                                                                        z3 = i;
                                                                    }
                                                                    ahvr.bY(z3);
                                                                    android.os.HandlerThread handlerThread4 = fdvVar.b;
                                                                    handlerThread4.start();
                                                                    android.os.Handler handler4 = new android.os.Handler(handlerThread4.getLooper());
                                                                    mediaCodec.setCallback(fdvVar, handler4);
                                                                    fdvVar.c = handler4;
                                                                    android.os.Trace.beginSection("configureCodec");
                                                                    mediaCodec.configure((android.media.MediaFormat) obj12, (android.view.Surface) obj3, (android.media.MediaCrypto) obj13, i3);
                                                                    android.os.Trace.endSection();
                                                                    fdrVar2.c.e();
                                                                    android.os.Trace.beginSection("startCodec");
                                                                    mediaCodec.start();
                                                                    android.os.Trace.endSection();
                                                                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                                                                        hjxVar.c(mediaCodec);
                                                                    }
                                                                    fdrVar2.d = 1;
                                                                    ferVar = fdrVar2;
                                                                }
                                                                this.v = ferVar;
                                                                this.W = ferVar.t(new rai(this));
                                                                android.os.Trace.endSection();
                                                                g();
                                                                long jElapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
                                                                if (!feeVar.e(this.k, eqgVar5)) {
                                                                    java.lang.Object[] objArr3 = new java.lang.Object[2];
                                                                    objArr3[i] = defpackage.eqg.c(eqgVar5);
                                                                    objArr3[1] = str4;
                                                                    defpackage.etr.f(str3, eum.G("Format exceeds selected codec's capabilities [%s, %s]", objArr3));
                                                                }
                                                                this.R = fZ;
                                                                this.w = eqgVar5;
                                                                int i7 = defpackage.equ.a;
                                                                if (!android.os.Build.MANUFACTURER.equals("Amazon")) {
                                                                    z4 = i;
                                                                } else {
                                                                    z4 = i;
                                                                }
                                                                this.U = z4;
                                                                ahvr.ci(this.v);
                                                                if (this.b == 2) {
                                                                    g();
                                                                    this.z = android.os.SystemClock.elapsedRealtime() + 1000;
                                                                }
                                                                this.F.a++;
                                                                long j3 = jElapsedRealtime4 - jElapsedRealtime;
                                                                if (android.os.Build.VERSION.SDK_INT >= 31) {
                                                                    defpackage.fea feaVar3 = this.v;
                                                                    ahvr.ci(feaVar3);
                                                                    feaVar3.n(new java.util.ArrayList((java.util.Collection) this.as));
                                                                }
                                                                str3 = str3;
                                                                feeVar = feeVar;
                                                                aq(str4, jElapsedRealtime4, j3);
                                                                str3 = str3;
                                                            } catch (java.lang.Throwable th) {
                                                                th = th;
                                                                arrayDeque = arrayDeque4;
                                                                str3 = str3;
                                                                feeVar = feeVar;
                                                                android.os.Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                        android.os.Trace.beginSection("configureCodec");
                                                        java.lang.Object obj14 = kltVarAs.d;
                                                        mediaCodecCreateByCodecName2.configure((android.media.MediaFormat) kltVarAs.e, (android.view.Surface) obj14, (android.media.MediaCrypto) kltVarAs.b, (obj14 == null && ((defpackage.fee) obj4).i && android.os.Build.VERSION.SDK_INT >= 35) ? 8 : i);
                                                        android.os.Trace.endSection();
                                                        android.os.Trace.beginSection("startCodec");
                                                        mediaCodecCreateByCodecName2.start();
                                                        android.os.Trace.endSection();
                                                        ferVar = new defpackage.fer(mediaCodecCreateByCodecName2, (defpackage.hjx) kltVarAs.a);
                                                        this.v = ferVar;
                                                        this.W = ferVar.t(new rai(this));
                                                        android.os.Trace.endSection();
                                                        g();
                                                        long jElapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
                                                        if (!feeVar.e(this.k, eqgVar5)) {
                                                            java.lang.Object[] objArr4 = new java.lang.Object[2];
                                                            objArr4[i] = defpackage.eqg.c(eqgVar5);
                                                            objArr4[1] = str4;
                                                            defpackage.etr.f(str3, eum.G("Format exceeds selected codec's capabilities [%s, %s]", objArr4));
                                                        }
                                                        this.R = fZ;
                                                        this.w = eqgVar5;
                                                        int i8 = defpackage.equ.a;
                                                        if (!android.os.Build.MANUFACTURER.equals("Amazon")) {
                                                            z4 = i;
                                                        } else {
                                                            z4 = i;
                                                        }
                                                        this.U = z4;
                                                        ahvr.ci(this.v);
                                                        if (this.b == 2) {
                                                            g();
                                                            this.z = android.os.SystemClock.elapsedRealtime() + 1000;
                                                        }
                                                        this.F.a++;
                                                        long j4 = jElapsedRealtime5 - jElapsedRealtime;
                                                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                                                            defpackage.fea feaVar4 = this.v;
                                                            ahvr.ci(feaVar4);
                                                            feaVar4.n(new java.util.ArrayList((java.util.Collection) this.as));
                                                        }
                                                        str3 = str3;
                                                        feeVar = feeVar;
                                                        aq(str4, jElapsedRealtime5, j4);
                                                        str3 = str3;
                                                    } catch (java.io.IOException | java.lang.RuntimeException e10) {
                                                        e = e10;
                                                        if (mediaCodecCreateByCodecName2 != null) {
                                                            try {
                                                                mediaCodecCreateByCodecName2.release();
                                                            } catch (java.lang.Throwable th2) {
                                                                th = th2;
                                                                android.os.Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                        throw e;
                                                    }
                                                    obj4 = kltVarAs.c;
                                                    java.lang.String str16 = ((defpackage.fee) obj4).b;
                                                    android.os.Trace.beginSection("createCodec:".concat(str16));
                                                    mediaCodecCreateByCodecName2 = android.media.MediaCodec.createByCodecName(str16);
                                                    android.os.Trace.endSection();
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    str3 = str3;
                                                    feeVar = feeVar;
                                                    android.os.Trace.endSection();
                                                    throw th;
                                                }
                                            } catch (java.io.IOException | java.lang.RuntimeException e11) {
                                                e = e11;
                                                mediaCodecCreateByCodecName2 = null;
                                            }
                                            arrayDeque = arrayDeque4;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        str3 = str3;
                                        feeVar = feeVar;
                                        arrayDeque = arrayDeque4;
                                    }
                                } catch (java.lang.Exception e12) {
                                    e = e12;
                                    str3 = str3;
                                    arrayDeque = arrayDeque4;
                                }
                            } catch (java.lang.Exception e13) {
                                e = e13;
                                arrayDeque = arrayDeque4;
                                i = i4;
                                feeVar = feeVar;
                                java.lang.String str17 = feeVar.b;
                                defpackage.etr.g(str3, "Failed to initialize decoder: ".concat(str17), e);
                                arrayDeque.removeFirst();
                                z2 = z;
                                java.lang.String str18 = "Decoder init failed: " + str17 + ", " + eqgVar3.toString();
                                java.lang.String str19 = eqgVar3.p;
                                if (e instanceof android.media.MediaCodec.CodecException) {
                                    diagnosticInfo = ((android.media.MediaCodec.CodecException) e).getDiagnosticInfo();
                                } else {
                                    diagnosticInfo = null;
                                }
                                mediaCrypto = mediaCrypto3;
                                eqgVar2 = eqgVar3;
                                fegVar = new defpackage.feg(str18, e, str19, z2, feeVar, diagnosticInfo);
                                af(fegVar);
                                fegVar2 = this.T;
                                if (fegVar2 == null) {
                                    this.T = fegVar;
                                } else {
                                    this.T = new defpackage.feg(fegVar2.getMessage(), fegVar2.getCause(), fegVar2.a, fegVar2.b, fegVar2.c, fegVar2.d);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.T;
                                }
                                mediaCrypto3 = mediaCrypto;
                                eqgVar3 = eqgVar2;
                                str3 = str3;
                                z = z2;
                                i4 = i;
                                arrayDeque2 = arrayDeque;
                                obj5 = null;
                            }
                        } catch (java.lang.Exception e14) {
                            e = e14;
                            arrayDeque = arrayDeque2;
                        }
                        i4 = i;
                        arrayDeque2 = arrayDeque;
                        obj5 = null;
                    }
                } else {
                    throw new defpackage.feg(eqgVar3, null, z, -49999);
                }
            } catch (defpackage.feg e15) {
                e = e15;
                throw h(e, eqgVar, false, 4001);
            }
        } catch (defpackage.feg e16) {
            e = e16;
        }
        android.media.MediaCrypto mediaCrypto4 = this.O;
        if (mediaCrypto4 == null || this.v != null) {
            return;
        }
        mediaCrypto4.release();
        this.O = mediaCrypto2;
    }

    @Override // defpackage.ewz, defpackage.ezg
    public final int dE() {
        return 8;
    }

    @Override // defpackage.ewz, defpackage.ezf
    public final long e(long j, long j2) {
        return ab(j, j2, this.W);
    }

    @Override // defpackage.ewz, defpackage.ezc
    public void p(int i, java.lang.Object obj) {
        if (i == 11) {
            rai raiVar = (rai) obj;
            ahvr.ci(raiVar);
            this.I = raiVar;
            return;
        }
        if (i != 21) {
            if (i == 22) {
                ahvr.ci(obj);
                aihd aihdVar = (aihd) obj;
                if (this.as.equals(aihdVar)) {
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    java.util.HashSet hashSet = new java.util.HashSet((java.util.Collection) aihdVar);
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    ailj ailjVarK = this.as.k();
                    while (ailjVarK.hasNext()) {
                        java.lang.String str = (java.lang.String) ailjVarK.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    defpackage.fea feaVar = this.v;
                    if (feaVar != null) {
                        if (!hashSet2.isEmpty()) {
                            feaVar.o(new java.util.ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            feaVar.n(new java.util.ArrayList(hashSet));
                        }
                    }
                }
                this.as = aihdVar;
                return;
            }
            return;
        }
        ahvr.ci(obj);
        defpackage.exa exaVar = (defpackage.exa) obj;
        this.aq = exaVar;
        defpackage.fea feaVar2 = this.v;
        if (feaVar2 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.util.Map.Entry entry : exaVar.b.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof java.lang.Integer) {
                        bundle.putInt(str2, ((java.lang.Integer) value).intValue());
                    } else if (value instanceof java.lang.Long) {
                        bundle.putLong(str2, ((java.lang.Long) value).longValue());
                    } else if (value instanceof java.lang.Float) {
                        bundle.putFloat(str2, ((java.lang.Float) value).floatValue());
                    } else if (value instanceof java.lang.String) {
                        bundle.putString(str2, (java.lang.String) value);
                    } else if (value instanceof java.nio.ByteBuffer) {
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            feaVar2.l(bundle);
        }
    }

    @Override // defpackage.ewz
    protected void s() {
        this.t = null;
        ba(defpackage.feh.a);
        this.J.clear();
        if (this.A) {
            aQ();
        } else {
            bf();
        }
    }

    @Override // defpackage.ewz
    protected void t(boolean z, boolean z2) {
        this.F = new defpackage.exc();
    }

    @Override // defpackage.ewz
    protected void u(long j, boolean z, boolean z2) throws java.lang.Throwable {
        java.util.ArrayDeque arrayDeque = this.J;
        if (!arrayDeque.isEmpty()) {
            this.am = (defpackage.feh) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.ak = false;
            this.D = false;
            if (this.A) {
                aV();
            } else {
                aM();
            }
            defpackage.euj eujVar = this.am.e;
            if (eujVar.a() > 0) {
                this.al = true;
            }
            eujVar.e();
            this.am.h = false;
        }
    }

    @Override // defpackage.ewz
    protected void w() {
        try {
            aQ();
            aC();
        } finally {
            bb(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r2 >= r0) goto L17;
     */
    @Override // defpackage.ewz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void z(defpackage.eqg[] r13, long r14, long r16, defpackage.ffu r18) {
        /*
            r12 = this;
            long r7 = r12.i
            fgv r13 = r12.c
            ahvr.ci(r13)
            int r9 = r13.a()
            feh r13 = r12.am
            long r0 = r13.d
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 != 0) goto L39
            feh r0 = new feh
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.ba(r0)
            boolean r13 = r12.aJ()
            if (r13 != 0) goto L35
            r13 = 2
            boolean r13 = defpackage.eqe.b(r13)
            if (r13 == 0) goto L7a
        L35:
            r12.ak()
            goto L7a
        L39:
            java.util.ArrayDeque r13 = r12.J
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L6d
            long r0 = r12.C
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L51
            long r2 = r12.G
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6d
        L51:
            feh r0 = new feh
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.ba(r0)
            feh r13 = r12.am
            long r0 = r13.d
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L7a
            r12.ak()
            goto L7a
        L6d:
            feh r0 = new feh
            long r1 = r12.C
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r13.add(r0)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fei.z(eqg[], long, long, ffu):void");
    }

    protected void ak() {
    }

    protected void aB(defpackage.ewu ewuVar) {
    }

    protected void aN(defpackage.eqg eqgVar) {
    }

    protected void aj(long j) {
    }
}
