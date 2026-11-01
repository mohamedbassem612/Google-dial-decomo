package com.google.android.libraries.social.licenses;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LicenseActivity extends da {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        ms.a(this);
        super.onCreate(bundle);
        setContentView(2131624299);
        final android.support.v7.widget.Toolbar toolbarFindViewById = findViewById(2131428461);
        k(toolbarFindViewById);
        com.google.android.libraries.social.licenses.License license = (com.google.android.libraries.social.licenses.License) getIntent().getParcelableExtra("license");
        if (i() != null) {
            cp cpVarI = i();
            java.lang.String str = license.a;
            cpVarI.j(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            toolbarFindViewById.findViewsWithText(arrayList, str, 1);
            if (arrayList.size() == 1) {
                dzs.j((android.view.View) arrayList.get(0), true);
            }
            i().s();
            i().u();
            i().t();
        }
        android.view.View viewFindViewById = findViewById(2131428454);
        final android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(2131428455);
        final int paddingLeft = toolbarFindViewById.getPaddingLeft();
        final int paddingTop = toolbarFindViewById.getPaddingTop();
        final int paddingRight = toolbarFindViewById.getPaddingRight();
        final int paddingBottom = toolbarFindViewById.getPaddingBottom();
        final int paddingLeft2 = scrollView.getPaddingLeft();
        final int paddingTop2 = scrollView.getPaddingTop();
        final int paddingRight2 = scrollView.getPaddingRight();
        final int paddingBottom2 = scrollView.getPaddingBottom();
        dyy dyyVar = new dyy() { // from class: afbi
            public final eax dC(android.view.View view, eax eaxVar) {
                eak eahVar;
                dwn dwnVarF = eaxVar.f(519);
                int i = dwnVarF.b;
                int i2 = dwnVarF.c;
                int i3 = dwnVarF.d;
                int i4 = paddingRight;
                toolbarFindViewById.setPadding(paddingLeft + i, paddingTop + i2, i4 + i3, paddingBottom);
                int i5 = dwnVarF.e;
                int i6 = paddingBottom2;
                int i7 = paddingRight2;
                scrollView.setPadding(paddingLeft2 + i, paddingTop2, i7 + i3, i6 + i5);
                if (android.os.Build.VERSION.SDK_INT >= 36) {
                    eahVar = new eak(eaxVar);
                } else if (android.os.Build.VERSION.SDK_INT >= 35) {
                    eahVar = new eaj(eaxVar);
                } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                    eahVar = new eai(eaxVar);
                } else {
                    eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah(eaxVar) : new eag(eaxVar);
                }
                eahVar.d(519, dwn.d(i, 0, i3, i5));
                return eahVar.a();
            }
        };
        int i = dzs.a;
        dzk.o(viewFindViewById, dyyVar);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428456);
        java.lang.String strA = defpackage.afcd.a(this, "third_party_licenses", license.b, license.c);
        if (strA == null) {
            finish();
        } else {
            textView.setText(strA);
        }
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(2131428455);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new mo(this, i, scrollView, 11));
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(2131428455);
        android.text.Layout layout = ((android.widget.TextView) findViewById(2131428456)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
