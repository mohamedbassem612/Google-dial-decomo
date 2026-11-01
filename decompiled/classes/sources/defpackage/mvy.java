package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mvy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/locale/DobbySingletonLocaleProvider");
    public final android.content.Context b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public final defpackage.aoin i;
    public final defpackage.aoir j;
    private final defpackage.aoin k;

    public mvy(android.content.Context context, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("isUserInUs");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("isUserInUk");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("isUserInJp");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("isUserInCa");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("isUserInIe");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("isUserInAu");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("isUserInIndia");
        }
        if (aoinVar8 == null) {
            defpackage.aooh.i("dobbyAsrEnhancementPolicy");
        }
        this.b = context;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.h = aoinVar6;
        this.i = aoinVar7;
        this.k = aoinVar8;
        this.j = new defpackage.aoiy(new defpackage.mbe(this, 9));
    }

    public final ihj a() {
        ihj ihjVarB = ihj.b((int) ((java.lang.Number) this.k.a()).longValue());
        if (ihjVarB == null) {
            return ihj.a;
        }
        java.lang.String str = (java.lang.String) this.j.a();
        return (defpackage.aooh.n(str, "hi-IN") || defpackage.aooh.n(str, "en-IN")) ? ihj.e : ihjVarB;
    }

    public final java.lang.Integer b() {
        int iOrdinal = a().ordinal();
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? null : 255;
        }
        return 267;
    }

    public final java.lang.String c() {
        java.lang.String str = (java.lang.String) this.j.a();
        int iHashCode = str.hashCode();
        if (iHashCode != 96598217) {
            if (iHashCode != 99219825) {
                if (iHashCode == 100828572 && str.equals("ja-JP")) {
                    java.lang.String string = this.b.getString(2132017353);
                    defpackage.aooh.e(string, "getString(...)");
                    return string;
                }
            } else if (str.equals("hi-IN")) {
                java.lang.String string2 = this.b.getString(2132017352);
                defpackage.aooh.e(string2, "getString(...)");
                return string2;
            }
        } else if (str.equals("en-IN")) {
            java.lang.String string3 = this.b.getString(2132017351);
            defpackage.aooh.e(string3, "getString(...)");
            return string3;
        }
        java.lang.String string4 = this.b.getString(2132017350);
        defpackage.aooh.e(string4, "getString(...)");
        return string4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0.equals("hi-IN") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r0.equals("en-IN") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r4 = r4.b.getString(2132020036);
        defpackage.aooh.e(r4, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d() {
        /*
            r4 = this;
            aoir r0 = r4.j
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.hashCode()
            r2 = 96598217(0x5c1f8c9, float:1.8241022E-35)
            java.lang.String r3 = "getString(...)"
            if (r1 == r2) goto L3b
            r2 = 99219825(0x5e9f971, float:2.2002845E-35)
            if (r1 == r2) goto L32
            r2 = 100828572(0x602859c, float:2.4548443E-35)
            if (r1 != r2) goto L43
            java.lang.String r1 = "ja-JP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            android.content.Context r4 = r4.b
            r0 = 2132020037(0x7f140b45, float:1.9678426E38)
            java.lang.String r4 = r4.getString(r0)
            defpackage.aooh.e(r4, r3)
            goto L5c
        L32:
            java.lang.String r1 = "hi-IN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L43
            goto L50
        L3b:
            java.lang.String r1 = "en-IN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
        L43:
            android.content.Context r4 = r4.b
            r0 = 2132020032(0x7f140b40, float:1.9678416E38)
            java.lang.String r4 = r4.getString(r0)
            defpackage.aooh.e(r4, r3)
            goto L5c
        L50:
            android.content.Context r4 = r4.b
            r0 = 2132020036(0x7f140b44, float:1.9678424E38)
            java.lang.String r4 = r4.getString(r0)
            defpackage.aooh.e(r4, r3)
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvy.d():java.lang.String");
    }
}
