package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class vyn extends androidx.constraintlayout.widget.ConstraintLayout implements amyq {
    private defpackage.amyh j;
    private boolean k;

    public vyn(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.amyh b() {
        defpackage.amyh amyhVar = this.j;
        if (amyhVar != null) {
            return amyhVar;
        }
        defpackage.amyh amyhVar2 = new defpackage.amyh(this);
        this.j = amyhVar2;
        return amyhVar2;
    }

    protected final void f() {
        if (this.k) {
            return;
        }
        this.k = true;
        B();
    }

    public vyn(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    public vyn(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        f();
    }

    vyn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        f();
    }
}
