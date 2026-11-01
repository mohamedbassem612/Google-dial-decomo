package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dic {
    public final defpackage.aomy a;
    public final defpackage.aomy b;
    public final boolean c;

    public dic(defpackage.aomy aomyVar, defpackage.aomy aomyVar2, boolean z) {
        this.a = aomyVar;
        this.b = aomyVar2;
        this.c = z;
    }

    public final java.lang.String toString() {
        defpackage.aomy aomyVar = this.b;
        return "ScrollAxisRange(value=" + this.a.a() + ", maxValue=" + aomyVar.a() + ", reverseScrolling=" + this.c + ')';
    }
}
