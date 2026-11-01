package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aelj implements java.lang.Runnable {
    public final /* synthetic */ double a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ adai g;

    public /* synthetic */ aelj(adai adaiVar, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        this.g = adaiVar;
        this.a = d;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ((afim) ((defpackage.ahix) this.g.a.eZ()).g.eZ()).b(this.a, new java.lang.Object[]{this.b, this.c, this.d, this.e, java.lang.Boolean.valueOf(this.f)});
    }
}
