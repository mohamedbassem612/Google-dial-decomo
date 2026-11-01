package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdw {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public int c;
    public defpackage.aonn d;
    final /* synthetic */ defpackage.aogc e;

    public bdw(defpackage.aogc aogcVar, int i, java.lang.Object obj, java.lang.Object obj2) {
        this.e = aogcVar;
        this.a = obj;
        this.b = obj2;
        this.c = i;
    }

    public final defpackage.aonn a() {
        defpackage.aonn aonnVar = this.d;
        if (aonnVar != null) {
            return aonnVar;
        }
        defpackage.cja cjaVar = new defpackage.cja(818252804, true, new defpackage.bec(this.e, this, 1));
        this.d = cjaVar;
        return cjaVar;
    }
}
