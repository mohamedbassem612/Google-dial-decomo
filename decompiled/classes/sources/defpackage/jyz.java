package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jyz {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/coalescer/CoalescedRowsUpdatedNotifier");
    public final android.content.Context b;
    public final defpackage.aoss c;
    public final defpackage.aoyq d;
    public final defpackage.aoyt e;

    public jyz(android.content.Context context, defpackage.aoss aossVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = context;
        this.c = aossVar;
        defpackage.aoyq aoyqVarC = defpackage.aoyx.c(0, 0, 0, 7);
        this.d = aoyqVarC;
        this.e = new defpackage.aoyr(aoyqVarC, null);
    }
}
