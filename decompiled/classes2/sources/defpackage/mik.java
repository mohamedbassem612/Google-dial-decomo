package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mik {
    public static final aimz a = aimz.i("com/android/dialer/dialpadview/DeviceIdDialogHandler");

    public static void a(android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624407, viewGroup, false);
        viewGroup.addView(viewGroup2);
        ((android.widget.TextView) viewGroup2.findViewById(2131427958)).setText(str.trim());
        ((android.widget.TextView) viewGroup2.findViewById(2131427959)).setText(str2);
        e((android.widget.ImageView) viewGroup2.findViewById(2131427951), str2);
    }

    public static void b(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "00000000000000")) {
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624406, viewGroup, false);
        viewGroup.addView(viewGroup2);
        java.lang.String strSubstring = str.length() == 15 ? str.substring(0, 14) : str;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(2131427952);
        if (strSubstring.length() == 14 && z) {
            ((android.widget.TextView) viewGroup2.findViewById(2131427954)).setText(d(strSubstring));
            ((android.widget.TextView) viewGroup2.findViewById(2131427955)).setText(context.getResources().getString(2132018342, str2));
            e(imageView, d(strSubstring));
        } else {
            viewGroup2.findViewById(2131427954).setVisibility(8);
            viewGroup2.findViewById(2131427955).setVisibility(8);
            imageView.setVisibility(8);
        }
        java.lang.String strBr = !android.text.TextUtils.isEmpty(str3) ? a.br(str3, str, " / ") : str;
        if (android.text.TextUtils.isEmpty(str3)) {
            str2 = context.getResources().getString(2132018343, str2);
        }
        ((android.widget.TextView) viewGroup2.findViewById(2131427956)).setText(strBr);
        ((android.widget.TextView) viewGroup2.findViewById(2131427957)).setText(str2);
        e((android.widget.ImageView) viewGroup2.findViewById(2131427953), str);
    }

    public static boolean c(android.content.Context context) {
        return mni.aH(context).aC().a();
    }

    private static java.lang.String d(java.lang.String str) {
        java.lang.String strSubstring = str.substring(0, 8);
        java.lang.String strSubstring2 = str.substring(8);
        try {
            java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "%010d", java.lang.Long.valueOf(java.lang.Long.parseLong(strSubstring, 16)));
            try {
                java.lang.String str3 = java.lang.String.format(java.util.Locale.US, "%08d", java.lang.Long.valueOf(java.lang.Long.parseLong(strSubstring2, 16)));
                java.lang.StringBuilder sb = new java.lang.StringBuilder(22);
                sb.append((java.lang.CharSequence) str2, 0, 5);
                sb.append(' ');
                sb.append((java.lang.CharSequence) str2, 5, str2.length());
                sb.append(' ');
                sb.append((java.lang.CharSequence) str3, 0, 4);
                sb.append(' ');
                sb.append((java.lang.CharSequence) str3, 4, str3.length());
                return sb.toString();
            } catch (java.lang.NumberFormatException e) {
                a.bq(a.c(), "unable to parse hex", "com/android/dialer/dialpadview/DeviceIdDialogHandler", "getDecimalFromHex", (char) 472, "DeviceIdDialogHandler.java", e, zct.b);
                return "";
            }
        } catch (java.lang.NumberFormatException e2) {
            a.bq(a.c(), "unable to parse hex", "com/android/dialer/dialpadview/DeviceIdDialogHandler", "getDecimalFromHex", (char) 462, "DeviceIdDialogHandler.java", e2, zct.b);
            return "";
        }
    }

    private static void e(android.widget.ImageView imageView, java.lang.String str) {
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new defpackage.oge(imageView, str, 1));
    }
}
