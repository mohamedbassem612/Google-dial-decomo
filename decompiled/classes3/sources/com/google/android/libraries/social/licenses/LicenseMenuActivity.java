package com.google.android.libraries.social.licenses;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LicenseMenuActivity extends da {
    protected final void onCreate(android.os.Bundle bundle) {
        ms.a(this);
        super.onCreate(bundle);
        setContentView(2131624301);
        android.support.v7.widget.Toolbar toolbarFindViewById = findViewById(2131428460);
        k(toolbarFindViewById);
        java.lang.CharSequence title = getTitle();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        toolbarFindViewById.findViewsWithText(arrayList, title, 1);
        if (arrayList.size() == 1) {
            dzs.j((android.view.View) arrayList.get(0), true);
        }
        if (i() != null) {
            i().u();
        }
        android.view.View viewFindViewById = findViewById(2131428458);
        defpackage.afbk afbkVar = new defpackage.afbk(toolbarFindViewById, toolbarFindViewById.getPaddingLeft(), toolbarFindViewById.getPaddingTop(), toolbarFindViewById.getPaddingRight(), toolbarFindViewById.getPaddingBottom(), 1);
        int i = dzs.a;
        dzk.o(viewFindViewById, afbkVar);
        bo boVarA = a();
        if (boVarA.d(2131428459) instanceof defpackage.afbm) {
            return;
        }
        defpackage.afbm afbmVar = new defpackage.afbm();
        u uVar = new u(boVarA);
        uVar.e(2131428459, afbmVar, (java.lang.String) null, 1);
        uVar.c();
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
