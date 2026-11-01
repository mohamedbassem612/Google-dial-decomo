package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ffy implements java.util.function.Consumer {
    public final /* synthetic */ ffl a;
    public final /* synthetic */ ffq b;
    public final /* synthetic */ int c;
    public final /* synthetic */ alic d;

    public /* synthetic */ ffy(alic alicVar, ffl fflVar, ffq ffqVar, int i) {
        this.d = alicVar;
        this.a = fflVar;
        this.b = ffqVar;
        this.c = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        ((fga) obj).i(0, (ffu) this.d.b, this.a, this.b, this.c);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
