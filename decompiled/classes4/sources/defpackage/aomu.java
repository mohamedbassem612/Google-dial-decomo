package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aomu extends defpackage.aojk {
    final /* synthetic */ defpackage.aoqr a;
    private final java.util.ArrayDeque b;

    public aomu(defpackage.aoqr aoqrVar) {
        this.a = aoqrVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.b = arrayDeque;
        if (((java.io.File) aoqrVar.a).isDirectory()) {
            arrayDeque.push(new defpackage.aoms((java.io.File) aoqrVar.a, null));
        } else if (((java.io.File) aoqrVar.a).isFile()) {
            arrayDeque.push(new defpackage.aomt((java.io.File) aoqrVar.a));
        } else {
            b();
        }
    }

    @Override // defpackage.aojk
    protected final void a() {
        java.lang.Object obj;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.b;
            defpackage.aomv aomvVar = (defpackage.aomv) arrayDeque.peek();
            obj = null;
            if (aomvVar == null) {
                break;
            }
            java.io.File fileA = aomvVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (aooh.n(fileA, aomvVar.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    obj = fileA;
                    break;
                }
                arrayDeque.push(new defpackage.aoms(fileA, null));
            }
        }
        if (obj != null) {
            c(obj);
        } else {
            b();
        }
    }
}
