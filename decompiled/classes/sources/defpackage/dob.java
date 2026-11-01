package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dob extends android.text.TextPaint {
    public int a;
    private defpackage.dou b;
    private defpackage.crc c;
    private defpackage.cqg d;
    private defpackage.cqd e;
    private defpackage.cer f;
    private defpackage.cpp g;
    private defpackage.cpv h;
    private defpackage.den i;

    public dob(float f) {
        super(1);
        this.density = f;
        this.b = defpackage.dou.a;
        this.a = 3;
        this.c = defpackage.crc.a;
    }

    private final void g() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    private final defpackage.cpv h() {
        defpackage.cpv cpvVar = this.h;
        if (cpvVar != null) {
            return cpvVar;
        }
        defpackage.cpv cpvVar2 = new defpackage.cpv(this);
        this.h = cpvVar2;
        return cpvVar2;
    }

    public final void a(int i) {
        if (i != this.a) {
            h().i(i);
            this.a = i;
        }
    }

    public final void b(defpackage.cqd cqdVar, long j, float f) {
        defpackage.cpp cppVar;
        if (cqdVar == null) {
            g();
            return;
        }
        if ((!defpackage.aooh.n(this.e, cqdVar) || (cppVar = this.g) == null || cppVar.a != j) && j != 9205357640488583168L) {
            this.e = cqdVar;
            this.g = new defpackage.cpp(j);
            doa doaVar = new doa(cqdVar, j);
            defpackage.ajxw ajxwVar = defpackage.ceo.a;
            this.f = new defpackage.cbk(doaVar, null);
        }
        defpackage.cpv cpvVarH = h();
        defpackage.cer cerVar = this.f;
        cpvVarH.m(cerVar != null ? (android.graphics.Shader) cerVar.a() : null);
        this.d = null;
        dnv.d(this, f);
    }

    public final void c(long j) {
        defpackage.cqg cqgVar = this.d;
        if ((cqgVar == null || cqgVar.a != j) && j != 16) {
            this.d = new defpackage.cqg(j);
            float[] fArr = defpackage.crp.a;
            setColor((int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
            g();
        }
    }

    public final void d(defpackage.crc crcVar) {
        if (crcVar == null || defpackage.aooh.n(this.c, crcVar)) {
            return;
        }
        this.c = crcVar;
        if (defpackage.aooh.n(crcVar, defpackage.crc.a)) {
            clearShadowLayer();
            return;
        }
        defpackage.crc crcVar2 = this.c;
        float f = crcVar2.d;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (crcVar2.c >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (this.c.c & 4294967295L));
        long j = this.c.b;
        float[] fArr = defpackage.crp.a;
        setShadowLayer(f, fIntBitsToFloat, fIntBitsToFloat2, (int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
    }

    public final void e(defpackage.dou douVar) {
        if (douVar == null || defpackage.aooh.n(this.b, douVar)) {
            return;
        }
        this.b = douVar;
        setUnderlineText(douVar.a(defpackage.dou.b));
        setStrikeThruText(this.b.a(defpackage.dou.c));
    }

    public final void f(defpackage.den denVar) {
        if (denVar == null || defpackage.aooh.n(this.i, denVar)) {
            return;
        }
        this.i = denVar;
        if (!defpackage.aooh.n(denVar, defpackage.csl.a)) {
            throw new defpackage.aois();
        }
        setStyle(android.graphics.Paint.Style.FILL);
    }
}
