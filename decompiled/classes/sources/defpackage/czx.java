package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class czx extends defpackage.eac implements java.lang.Runnable, android.view.View.OnAttachStateChangeListener, defpackage.dyy {
    private static final java.lang.Integer[] a = {8, 64, 4, 1, 128, 16, 2, 32};
    private boolean b;
    private int c;
    private defpackage.eax e;
    private final defpackage.ccp f;
    private final defpackage.aco g;
    private final defpackage.aco h;

    public czx() {
        super(1);
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
        this.g = new defpackage.aco(8);
        this.h = new defpackage.aco(8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final defpackage.ccp h(int i) {
        defpackage.aco acoVar = this.g;
        defpackage.ccp ccpVar = (defpackage.ccp) acoVar.a(i);
        if (ccpVar != null) {
            return ccpVar;
        }
        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
        acoVar.g(i, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    private final void i(defpackage.eax eaxVar) {
        if (g() == null) {
            defpackage.dwn dwnVar = defpackage.dwn.a;
            java.lang.Integer[] numArr = a;
            int length = numArr.length;
            for (int i = 0; i < 8; i++) {
                int iIntValue = numArr[i].intValue();
                if (defpackage.aooh.n(iIntValue == 8 ? eaxVar.f(8) : eaxVar.g(iIntValue), dwnVar)) {
                }
            }
            dyo dyoVarK = eaxVar.k();
            if (dyoVarK == null) {
                return;
            }
            if (defpackage.aooh.n(dyoVarK.a(), dwnVar) && dyoVarK.b().isEmpty()) {
                return;
            }
        }
        this.f.b(eaxVar);
        defpackage.cfd.j();
    }

    @Override // defpackage.eac
    public final defpackage.eax b(defpackage.eax eaxVar, java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.aiyy aiyyVar = (defpackage.aiyy) list.get(i);
            int iG = aiyyVar.g();
            if ((this.c & iG) != 0) {
                h(iG).b(aiyyVar);
            }
        }
        i(eaxVar);
        return eaxVar;
    }

    @Override // defpackage.eac
    public final eab c(defpackage.aiyy aiyyVar, eab eabVar) {
        defpackage.eax eaxVar = this.e;
        this.b = false;
        this.e = null;
        if (aiyyVar.h() != 0 && eaxVar != null) {
            int iG = aiyyVar.g();
            defpackage.eax eaxVarG = g();
            defpackage.dwn dwnVarF = eaxVarG != null ? eaxVarG.f(iG) : null;
            defpackage.dwn dwnVarF2 = eaxVar.f(iG);
            if (!defpackage.aooh.n(dwnVarF2, dwnVarF) && dwnVarF != null) {
                this.c |= iG;
                h(iG).b(aiyyVar);
                f(iG).b(new defpackage.vx(dwnVarF, dwnVarF2, (char[]) null));
                defpackage.cfd.j();
            }
        }
        return eabVar;
    }

    @Override // defpackage.eac
    public final void d(defpackage.aiyy aiyyVar) {
        this.b = false;
        int iG = aiyyVar.g();
        h(iG).b(null);
        f(iG).b(null);
        this.c &= ~iG;
        this.e = null;
        defpackage.cfd.j();
    }

    @Override // defpackage.dyy
    public final defpackage.eax dC(android.view.View view, defpackage.eax eaxVar) {
        if (this.b) {
            this.e = eaxVar;
            if (android.os.Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (this.c == 0) {
            i(eaxVar);
        }
        return eaxVar;
    }

    @Override // defpackage.eac
    public final void e(defpackage.aiyy aiyyVar) {
        this.b = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final defpackage.ccp f(int i) {
        defpackage.aco acoVar = this.h;
        defpackage.ccp ccpVar = (defpackage.ccp) acoVar.a(i);
        if (ccpVar != null) {
            return ccpVar;
        }
        androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
        acoVar.g(i, parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public final defpackage.eax g() {
        return (defpackage.eax) this.f.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = defpackage.dzs.a;
        defpackage.dzk.o(view, this);
        defpackage.eae.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = defpackage.dzs.a;
        defpackage.dzk.o(view, null);
        baa$.ExternalSyntheticApiModelOutline1.m(view, (android.view.WindowInsetsAnimation.Callback) null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            this.c = 0;
            this.b = false;
            defpackage.eax eaxVar = this.e;
            if (eaxVar != null) {
                i(eaxVar);
                this.e = null;
            }
        }
    }
}
