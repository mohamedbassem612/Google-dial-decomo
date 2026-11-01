package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agkb {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    private java.lang.String j;
    private float k;
    private float l;

    public agkb(defpackage.agiw agiwVar) {
        this.j = agiwVar.a;
        this.a = agiwVar.b;
        this.b = agiwVar.c;
        this.c = agiwVar.d;
        this.d = agiwVar.e;
        this.k = agiwVar.f;
        this.e = agiwVar.g;
        this.f = agiwVar.h;
        this.g = agiwVar.i;
        this.h = agiwVar.j;
        this.i = agiwVar.k;
        this.l = agiwVar.l;
    }

    static /* synthetic */ java.lang.Object c(java.lang.Object obj) {
        defpackage.agkb agkbVar = (defpackage.agkb) obj;
        aooh.f(agkbVar, "$this$copy");
        agkbVar.i = 0.0f;
        return aojh.a;
    }

    public static /* synthetic */ java.lang.Object d(java.lang.Object obj) {
        defpackage.agkq agkqVar = (defpackage.agkq) obj;
        aooh.f(agkqVar, "$this$copy");
        agkqVar.c = 0.0f;
        return aojh.a;
    }

    public final defpackage.agiw a() {
        return new defpackage.agiw(this.j, this.a, this.b, this.c, this.d, this.k, this.e, this.f, this.g, this.h, this.i, this.l);
    }

    public final void b() {
        this.k = 1.0f;
    }

    public agkb() {
        this((byte[]) null);
    }

    public /* synthetic */ agkb(byte[] bArr) {
        this(new defpackage.agiw(null));
    }
}
