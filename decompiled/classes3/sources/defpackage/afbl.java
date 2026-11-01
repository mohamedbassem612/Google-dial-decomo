package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbl extends en {
    private static final boolean f;
    private static final kj g = new kj((char[]) null);
    public final com.google.android.libraries.social.licenses.LicenseMenuActivity e;

    static {
        boolean z = true;
        if (!"Oculus".equalsIgnoreCase(android.os.Build.MANUFACTURER) && !"Meta".equalsIgnoreCase(android.os.Build.MANUFACTURER)) {
            z = false;
        }
        f = z;
    }

    public afbl(com.google.android.libraries.social.licenses.LicenseMenuActivity licenseMenuActivity) {
        super(g);
        this.e = licenseMenuActivity;
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624297, viewGroup, false);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true)) {
            viewInflate.setBackgroundResource(typedValue.resourceId);
        }
        return new aham(viewInflate, (byte[]) null, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ void m(ld ldVar, int i) {
        aham ahamVar = (aham) ldVar;
        com.google.android.libraries.social.licenses.License license = (com.google.android.libraries.social.licenses.License) ((en) this).a.e.get(i);
        android.view.View view = ahamVar.s;
        java.lang.String str = license.a;
        android.widget.TextView textView = (android.widget.TextView) view;
        textView.setText(str);
        if (f) {
            textView.setContentDescription(str);
            ahamVar.a.setContentDescription(str);
        }
        ahamVar.a.setOnClickListener(new defpackage.wgf(this, license, 8, null));
    }
}
