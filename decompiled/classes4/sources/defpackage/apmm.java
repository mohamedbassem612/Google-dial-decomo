package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apmm implements aomy {
    public final /* synthetic */ apms a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ apmm(apms apmsVar, int i, long j) {
        this.a = apmsVar;
        this.b = i;
        this.c = j;
    }

    public final java.lang.Object a() {
        int i = this.b;
        apms apmsVar = this.a;
        try {
            apmsVar.u.e(i, this.c);
        } catch (java.io.IOException e) {
            apmsVar.d(e);
        }
        return aojh.a;
    }
}
