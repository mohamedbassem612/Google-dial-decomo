package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahgs implements amyp {
    private volatile java.lang.Object a;
    private final java.lang.Object b = new java.lang.Object();
    private final android.view.View c;

    public ahgs(android.view.View view) {
        this.c = view;
    }

    private final android.content.Context a(java.lang.Class cls) {
        android.view.View view = this.c;
        android.content.Context contextB = b(view.getContext(), cls);
        ahvr.cc(contextB != b(contextB.getApplicationContext(), amyp.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", view.getClass());
        return contextB;
    }

    private static android.content.Context b(android.content.Context context, java.lang.Class cls) {
        while ((context instanceof android.content.ContextWrapper) && !cls.isInstance(context)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final java.lang.Object B() {
        defpackage.ahgb ahgbVarH;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    amyf amyfVarA = a(amyf.class);
                    if (amyfVarA instanceof defpackage.ahgp) {
                        ahgbVarH = ((defpackage.ahgq) amyfVarA.a().B()).a().b().a();
                    } else {
                        if (!(amyfVarA instanceof amyf)) {
                            android.content.Context contextA = a(amyp.class);
                            android.view.View view = this.c;
                            ahvr.ce(!(contextA instanceof amyp), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", view.getClass(), contextA.getClass().getName());
                            throw new java.lang.IllegalStateException(java.lang.String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", view.getClass(), contextA.getClass().getName()));
                        }
                        android.view.View view2 = this.c;
                        ahvr.cc(true, "%s, Account views may only attach to account fragments.", view2.getClass());
                        kgo kgoVarDs = ((ahgr) amyfVarA.a().B()).ds();
                        kgoVarDs.c = view2;
                        ahgbVarH = kgoVarDs.h();
                    }
                    this.a = ahgbVarH;
                }
            }
        }
        return this.a;
    }
}
