package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class rcu extends android.support.v7.widget.RecyclerView implements amyq {
    private defpackage.ahgs ab;
    private boolean ac;

    public rcu(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        av();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.ahgs b() {
        defpackage.ahgs ahgsVar = this.ab;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        defpackage.ahgs ahgsVar2 = new defpackage.ahgs(this);
        this.ab = ahgsVar2;
        return ahgsVar2;
    }

    protected final void av() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        defpackage.rdr rdrVar = (defpackage.rdr) B();
        rdrVar.S();
    }

    public rcu(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        av();
    }

    public rcu(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        av();
    }
}
