package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fj extends ji {
    final /* synthetic */ android.support.v7.view.menu.ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(android.support.v7.view.menu.ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    public final defpackage.gi a() {
        defpackage.gw gwVar;
        apnt apntVar = this.a.c;
        if (apntVar == null || (gwVar = ((hb) apntVar.a).k) == null) {
            return null;
        }
        return gwVar.a();
    }

    protected final boolean b() {
        defpackage.gi giVarA;
        android.support.v7.view.menu.ActionMenuItemView actionMenuItemView = this.a;
        fs fsVar = actionMenuItemView.b;
        return fsVar != null && fsVar.b(actionMenuItemView.a) && (giVarA = a()) != null && giVarA.x();
    }
}
