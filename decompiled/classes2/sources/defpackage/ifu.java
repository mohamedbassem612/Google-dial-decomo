package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ifu extends androidx.constraintlayout.widget.ConstraintLayout implements amyq {
    private amyh j;
    private boolean k;

    public ifu(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final amyh b() {
        amyh amyhVar = this.j;
        if (amyhVar != null) {
            return amyhVar;
        }
        amyh amyhVar2 = new amyh(this);
        this.j = amyhVar2;
        return amyhVar2;
    }

    protected final void g() {
        if (this.k) {
            return;
        }
        this.k = true;
        B();
    }

    public ifu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    public ifu(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        g();
    }

    ifu(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        g();
    }
}
