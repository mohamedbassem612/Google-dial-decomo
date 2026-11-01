package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpb implements androidx.window.reflection.Consumer2 {
    private final defpackage.aonj a;

    public gpb(defpackage.aonj aonjVar) {
        if (aonjVar == null) {
            defpackage.aooh.i("block");
        }
        this.a = aonjVar;
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(java.util.List list) {
        defpackage.aooh.f(list, "value");
        this.a.a(list);
    }
}
