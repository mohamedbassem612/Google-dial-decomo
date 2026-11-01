package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class amyf extends android.content.ContextWrapper {
    public defpackage.aw a;
    public android.view.LayoutInflater b;
    public android.view.LayoutInflater c;
    private final defpackage.emv d;

    /* JADX WARN: Illegal instructions before constructor call */
    public amyf(android.view.LayoutInflater layoutInflater, defpackage.aw awVar) {
        android.content.Context context;
        if (layoutInflater == null || (context = layoutInflater.getContext()) == null) {
            throw null;
        }
        super(context);
        defpackage.mm mmVar = new defpackage.mm(this, 7);
        this.d = mmVar;
        this.b = layoutInflater;
        this.a = awVar;
        awVar.P().c(mmVar);
    }

    public final defpackage.aw a() {
        defpackage.anty.aI(this.a, "The fragment has already been destroyed.");
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        android.view.LayoutInflater layoutInflaterCloneInContext = this.c;
        if (layoutInflaterCloneInContext == null) {
            android.view.LayoutInflater layoutInflater = this.b;
            if (layoutInflater == null) {
                layoutInflater = (android.view.LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                this.b = layoutInflater;
            }
            layoutInflaterCloneInContext = layoutInflater.cloneInContext(this);
            this.c = layoutInflaterCloneInContext;
        }
        return layoutInflaterCloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amyf(android.content.Context context, defpackage.aw awVar) {
        super(context);
        context.getClass();
        defpackage.mm mmVar = new defpackage.mm(this, 7);
        this.d = mmVar;
        this.b = null;
        this.a = awVar;
        awVar.P().c(mmVar);
    }
}
