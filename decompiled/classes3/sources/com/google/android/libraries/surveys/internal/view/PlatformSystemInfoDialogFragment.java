package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PlatformSystemInfoDialogFragment extends android.app.DialogFragment {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getActivity(), 2132084154);
        android.view.View viewInflate = ((android.view.LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(2131624653, (android.view.ViewGroup) null);
        viewInflate.getContext().setTheme(2132084121);
        cy cyVarCreate = aehj.L(contextThemeWrapper).setView(viewInflate).create();
        viewInflate.findViewById(2131429200).setOnClickListener(new defpackage.wtm(cyVarCreate, 16));
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        android.os.Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131429199);
        recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        defpackage.afme afmeVar = new defpackage.afme();
        recyclerViewFindViewById.Y(afmeVar);
        recyclerViewFindViewById.au(new defpackage.afkr(this, viewInflate));
        afmeVar.w(aehj.G(contextThemeWrapper, string, bundle2));
        return cyVarCreate;
    }
}
