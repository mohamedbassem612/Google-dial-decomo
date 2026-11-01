package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ic extends defpackage.jv implements defpackage.id {
    public java.lang.CharSequence a;
    public android.widget.ListAdapter b;
    public final android.graphics.Rect c;
    public final /* synthetic */ defpackage.ie d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(defpackage.ie ieVar, android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 2130970412, 0);
        this.d = ieVar;
        this.c = new android.graphics.Rect();
        this.k = ieVar;
        y();
        this.l = new defpackage.agdj(this, 1);
    }

    @Override // defpackage.id
    public final java.lang.CharSequence d() {
        return this.a;
    }

    @Override // defpackage.jv, defpackage.id
    public final void e(android.widget.ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.id
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.id
    public final void i(java.lang.CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.id
    public final void k(int i, int i2) {
        android.view.ViewTreeObserver viewTreeObserver;
        boolean zX = x();
        n();
        w();
        super.v();
        defpackage.je jeVar = this.e;
        jeVar.setChoiceMode(1);
        jeVar.setTextDirection(i);
        jeVar.setTextAlignment(i2);
        defpackage.ie ieVar = this.d;
        int selectedItemPosition = ieVar.getSelectedItemPosition();
        defpackage.je jeVar2 = this.e;
        if (x() && jeVar2 != null) {
            jeVar2.a = false;
            jeVar2.setSelection(selectedItemPosition);
            if (jeVar2.getChoiceMode() != 0) {
                jeVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zX || (viewTreeObserver = ieVar.getViewTreeObserver()) == null) {
            return;
        }
        defpackage.gj gjVar = new defpackage.gj(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(gjVar);
        t(new ahpq(this, gjVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n() {
        int i;
        android.graphics.drawable.Drawable drawableC = c();
        defpackage.ie ieVar = this.d;
        if (drawableC != null) {
            android.graphics.Rect rect = ieVar.d;
            drawableC.getPadding(rect);
            i = den.bK(ieVar) ? rect.right : -rect.left;
        } else {
            android.graphics.Rect rect2 = ieVar.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        defpackage.ie ieVar2 = this.d;
        int paddingLeft = ieVar2.getPaddingLeft();
        int paddingRight = ieVar2.getPaddingRight();
        int width = ieVar2.getWidth();
        int i2 = ieVar2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = ieVar2.a(this.b, c());
            int i4 = ieVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            android.graphics.Rect rect3 = ieVar2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(java.lang.Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = den.bK(ieVar2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
