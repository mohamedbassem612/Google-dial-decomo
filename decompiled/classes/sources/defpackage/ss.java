package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ss extends defpackage.su implements java.util.Iterator {
    final /* synthetic */ defpackage.sv a;
    private defpackage.sr b;
    private boolean c = true;

    public ss(defpackage.sv svVar) {
        this.a = svVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.Map.Entry next() {
        defpackage.sr srVar;
        if (this.c) {
            this.c = false;
            srVar = this.a.a;
        } else {
            defpackage.sr srVar2 = this.b;
            srVar = srVar2 != null ? srVar2.c : null;
        }
        this.b = srVar;
        return srVar;
    }

    @Override // defpackage.su
    public final void b(defpackage.sr srVar) {
        defpackage.sr srVar2 = this.b;
        if (srVar == srVar2) {
            defpackage.sr srVar3 = srVar2.d;
            this.b = srVar3;
            this.c = srVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.c) {
            defpackage.sr srVar = this.b;
            if (srVar != null && srVar.c != null) {
                return true;
            }
        } else if (this.a.a != null) {
            return true;
        }
        return false;
    }
}
