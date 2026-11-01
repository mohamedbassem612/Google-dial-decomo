package androidx.compose.ui.platform;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ComposeView extends defpackage.ddl {
    private final defpackage.ccp a;
    private boolean b;

    public ComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
    }

    public final void a(defpackage.aonn aonnVar) {
        this.b = true;
        this.a.b(aonnVar);
        if (isAttachedToWindow()) {
            f();
        }
    }

    @Override // defpackage.ddl
    public final void b(defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(420213850);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.aonn aonnVar = (defpackage.aonn) this.a.a();
            if (aonnVar == null) {
                cavVarB.u(-1238823553);
            } else {
                cavVarB.u(98585282);
                aonnVar.a(cavVarB, 0);
            }
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.dfj(this, i, i4);
        }
    }

    @Override // defpackage.ddl
    protected final boolean d() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    public ComposeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ComposeView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
