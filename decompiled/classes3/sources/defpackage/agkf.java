package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkf {
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public java.lang.String f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;

    public agkf(defpackage.agiy agiyVar) {
        this.a = agiyVar.c;
        this.b = agiyVar.d;
        this.c = agiyVar.e;
        this.g = agiyVar.f;
        this.h = agiyVar.g;
        this.i = agiyVar.h;
        this.d = agiyVar.i;
        this.e = agiyVar.j;
        this.f = agiyVar.b;
        this.j = agiyVar.k;
        this.k = agiyVar.l;
        this.l = agiyVar.m;
        this.m = agiyVar.n;
    }

    public final defpackage.agiy a() {
        java.lang.String str = this.f;
        float f = this.a;
        int i = this.b;
        float f2 = this.c;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        float f6 = this.d;
        float f7 = this.e;
        float f8 = this.k;
        float f9 = this.l;
        float f10 = this.j;
        float f11 = this.m;
        defpackage.agix agixVar = defpackage.agiy.a;
        aooh.f(str, "mask");
        aooh.f(agixVar, "deviceType");
        return new defpackage.agiy(str, f, i, f2, f3, f4, f5, f6, f7, f10, f8, f9, f11, defpackage.agmc.J(agixVar));
    }

    public final void b() {
        this.a = 0.0f;
    }

    public agkf() {
        this((byte[]) null);
    }

    public /* synthetic */ agkf(byte[] bArr) {
        this(new defpackage.agiy(null));
    }
}
