package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tjz implements lot {
    public final /* synthetic */ defpackage.tkd a;
    public final /* synthetic */ com.android.dialer.timekeeper.histogram.HistogramView b;
    public final /* synthetic */ ucm c;

    public /* synthetic */ tjz(defpackage.tkd tkdVar, com.android.dialer.timekeeper.histogram.HistogramView histogramView, ucm ucmVar) {
        this.a = tkdVar;
        this.b = histogramView;
        this.c = ucmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.os.Parcelable, java.lang.Object] */
    public final void a(java.lang.Object obj) {
        com.android.dialer.timekeeper.histogram.HistogramView histogramView = this.b;
        ucm ucmVar = this.c;
        histogramView.m((j$.util.Optional) obj, (defpackage.vqu) ucmVar.a, (defpackage.abtr) ucmVar.b);
        defpackage.tkd tkdVar = this.a;
        j$.util.Optional optional = tkdVar.an;
        defpackage.qgz qgzVar = new defpackage.qgz(tkdVar, histogramView, 11);
        if (true == optional.isPresent()) {
            ?? r3 = optional.get();
            java.lang.Object obj2 = qgzVar.b;
            ((com.android.dialer.timekeeper.histogram.HistogramView) qgzVar.a).onRestoreInstanceState(r3);
            ((defpackage.tkd) obj2).an = j$.util.Optional.empty();
        }
    }
}
