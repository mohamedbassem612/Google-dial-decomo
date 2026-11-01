package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apml implements aomy {
    public final /* synthetic */ apms a;
    public final /* synthetic */ int b;
    public final /* synthetic */ apoy c;
    public final /* synthetic */ int d;

    public /* synthetic */ apml(apms apmsVar, int i, apoy apoyVar, int i2) {
        this.a = apmsVar;
        this.b = i;
        this.c = apoyVar;
        this.d = i2;
    }

    public final java.lang.Object a() {
        apms apmsVar = this.a;
        int i = this.b;
        try {
            this.c.A(this.d);
            apmsVar.u.d(i, apme.i);
            synchronized (apmsVar) {
                apmsVar.w.remove(java.lang.Integer.valueOf(i));
            }
        } catch (java.io.IOException unused) {
        }
        return aojh.a;
    }
}
