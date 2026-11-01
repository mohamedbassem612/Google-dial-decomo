package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amyh implements amyp {
    private volatile java.lang.Object a;
    private final java.lang.Object b = new java.lang.Object();
    private final android.view.View c;

    public amyh(android.view.View view) {
        this.c = view;
    }

    private final android.content.Context a(java.lang.Class cls) {
        android.view.View view = this.c;
        android.content.Context context = view.getContext();
        while ((context instanceof android.content.ContextWrapper) && !cls.isInstance(context)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (context != anty.aA(context.getApplicationContext())) {
            return context;
        }
        ajsz.dA(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new java.lang.Object[]{view.getClass()});
        return null;
    }

    public final java.lang.Object B() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    amyf amyfVarA = a(amyf.class);
                    if (!(amyfVarA instanceof amyf)) {
                        android.content.Context contextA = a(amyp.class);
                        android.view.View view = this.c;
                        ajsz.dA(!(contextA instanceof amyp), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", new java.lang.Object[]{view.getClass(), contextA.getClass().getName()});
                        throw new java.lang.IllegalStateException(java.lang.String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", view.getClass()));
                    }
                    boolean zEquals = amyfVarA.getClass().equals(amyf.class);
                    android.view.View view2 = this.c;
                    ajsz.dA(zEquals, "%s, Only account views can attach to account fragments.", new java.lang.Object[]{view2.getClass()});
                    kgo kgoVarDs = ((amyg) aooc.ar(amyfVarA.a(), amyg.class)).ds();
                    kgoVarDs.c = view2;
                    this.a = kgoVarDs.h();
                }
            }
        }
        return this.a;
    }
}
