package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afo {
    public final defpackage.agf a;
    public final defpackage.agg b;
    public final defpackage.ceg c;
    public defpackage.ahu d;

    public afo(defpackage.agf agfVar, defpackage.agg aggVar, float f, defpackage.ahu ahuVar) {
        this.a = agfVar;
        this.b = aggVar;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(f);
        this.d = ahuVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ afo(defpackage.agf agfVar, defpackage.agg aggVar, defpackage.ahu ahuVar, int i) {
        if ((i & 8) != 0) {
            defpackage.ajl ajlVar = defpackage.aen.a;
            ahuVar = defpackage.aen.c;
        }
        this(agfVar, aggVar, 0.0f, ahuVar);
    }
}
