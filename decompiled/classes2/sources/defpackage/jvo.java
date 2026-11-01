package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class jvo extends com.google.android.material.chip.Chip implements amyq {
    private ahgs h;
    private boolean i;

    public jvo(android.content.Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ahgs b() {
        ahgs ahgsVar = this.h;
        if (ahgsVar != null) {
            return ahgsVar;
        }
        ahgs ahgsVar2 = new ahgs(this);
        this.h = ahgsVar2;
        return ahgsVar2;
    }

    protected final void d() {
        if (this.i) {
            return;
        }
        this.i = true;
        defpackage.jvb jvbVar = (defpackage.jvb) B();
        jvbVar.C();
    }

    public jvo(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        d();
    }

    public jvo(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        d();
    }
}
