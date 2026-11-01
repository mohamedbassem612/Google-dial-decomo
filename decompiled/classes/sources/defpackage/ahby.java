package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahby {
    public final java.lang.String a;
    public final defpackage.aexf b;
    public final defpackage.ajdd c;
    public final defpackage.agtc d;
    final /* synthetic */ defpackage.ahbz e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public ahby(defpackage.ahbz ahbzVar, java.lang.String str, defpackage.aexf aexfVar) {
        if (str == null) {
            defpackage.aooh.i("mendelPackage");
        }
        if (aexfVar == null) {
            defpackage.aooh.i("commitProperties");
        }
        this.e = ahbzVar;
        this.a = str;
        this.b = aexfVar;
        this.c = new defpackage.ajdd();
        this.d = new defpackage.agtc(new defpackage.lkf(ahbzVar, this, 9, null), ahbzVar.c);
    }
}
