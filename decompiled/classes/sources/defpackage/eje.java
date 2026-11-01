package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eje extends defpackage.dye {
    final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout a;

    public eje(androidx.drawerlayout.widget.DrawerLayout drawerLayout) {
        this.a = drawerLayout;
        new android.graphics.Rect();
    }

    @Override // defpackage.dye
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.dye
    public final void c(android.view.View view, ebd ebdVar) {
        super.c(view, ebdVar);
        ebdVar.s("androidx.drawerlayout.widget.DrawerLayout");
        ebdVar.A(false);
        ebdVar.B(false);
        ebdVar.ad(ebc.a);
        ebdVar.ad(ebc.b);
    }

    @Override // defpackage.dye
    public final boolean g(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.g(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.a;
        android.view.View viewE = drawerLayout.e();
        if (viewE != null) {
            android.view.Gravity.getAbsoluteGravity(drawerLayout.b(viewE), drawerLayout.getLayoutDirection());
        }
        return true;
    }
}
