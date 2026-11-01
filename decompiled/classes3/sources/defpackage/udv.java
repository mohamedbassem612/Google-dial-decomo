package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class udv implements java.util.function.Consumer {
    public final /* synthetic */ udy a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ long c;

    public /* synthetic */ udv(udy udyVar, java.lang.String str, long j) {
        this.a = udyVar;
        this.b = str;
        this.c = j;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.a.h.h((rmw) obj, this.b, this.c);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
