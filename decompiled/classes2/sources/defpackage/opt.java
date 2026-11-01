package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opt {
    public static final defpackage.opt a = new defpackage.opt();
    private static final int b = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.getPathSegments().size();

    public static final java.lang.String a(abwd abwdVar) {
        aooh.f(abwdVar, "photoInfo");
        java.lang.String str = abwdVar.g;
        aooh.e(str, "getLookupUri(...)");
        if (str.length() == 0) {
            java.lang.String str2 = abwdVar.c;
            if (str2.length() == 0) {
                str2 = abwdVar.d;
            }
            aooh.e(str2, "ifEmpty(...)");
            return str2;
        }
        java.lang.String str3 = abwdVar.g;
        aooh.e(str3, "getLookupUri(...)");
        java.lang.String string = android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI.toString();
        aooh.e(string, "toString(...)");
        if (!aoov.ad(str3, string)) {
            return str3;
        }
        java.util.List<java.lang.String> pathSegments = android.net.Uri.parse(str3).getPathSegments();
        int size = pathSegments.size();
        int i = b;
        if (size <= i) {
            return str3;
        }
        java.lang.String str4 = pathSegments.get(i);
        if (aooh.n(str4, "encoded")) {
            return str3;
        }
        aooh.c(str4);
        return str4;
    }

    public static final boolean b(char c) {
        if (c >= 'A' && c < '[') {
            return true;
        }
        if (c < 'a' || c >= '{') {
            return (afsq.cl(c) || afsq.cs(c)) ? false : true;
        }
        return true;
    }

    public static final boolean c(abwd abwdVar) {
        aooh.f(abwdVar, "photoInfo");
        java.lang.String str = abwdVar.g;
        aooh.e(str, "getLookupUri(...)");
        if (str.length() <= 0) {
            return false;
        }
        java.lang.String str2 = abwdVar.c;
        aooh.e(str2, "getName(...)");
        return str2.length() > 0 && b(abwdVar.c.charAt(0));
    }

    public static final abko d(abwd abwdVar, android.content.Context context, boolean z, boolean z2) {
        defpackage.abkp abkpVar;
        aooh.f(abwdVar, "photoInfo");
        aooh.f(context, "appContext");
        java.lang.String string = android.text.TextUtils.expandTemplate(context.getText(2132019355), pez.aq(context, abwdVar.c)).toString();
        aooh.f(abwdVar, "photoInfo");
        java.lang.String strA = a(abwdVar);
        lpz lpzVar = lqa.a;
        aooh.f(strA, "lookUpKey");
        float[] fArr = new float[3];
        android.graphics.Color.colorToHSV(cfd.L(lqa.a.a(strA)), fArr);
        float f = fArr[0];
        if (abwdVar.j) {
            return new defpackage.abjr(1, string);
        }
        if (abwdVar.k) {
            return new defpackage.abjr(true != z ? 5 : 6, string);
        }
        if (abwdVar.q) {
            return new defpackage.abjr(4, string);
        }
        if (abwdVar.i) {
            return new defpackage.abkp(new defpackage.abju(defpackage.abja.gC, new defpackage.abjx(f)), string);
        }
        if (abwdVar.h) {
            return new defpackage.abkp(new defpackage.abju(defpackage.abja.bn, new defpackage.abjx(f)), string);
        }
        if (abwdVar.n) {
            return new defpackage.abjr(2, string);
        }
        java.lang.String str = abwdVar.e;
        aooh.e(str, "getPhotoUri(...)");
        if (str.length() > 0) {
            java.lang.String str2 = abwdVar.e;
            aooh.e(str2, "getPhotoUri(...)");
            android.net.Uri uri = android.net.Uri.parse(str2);
            aooh.e(uri, "parse(...)");
            abkpVar = new defpackage.abkp(new defpackage.abkh(uri, null, z2, 6), string);
        } else if (abwdVar.f != 0) {
            android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, abwdVar.f);
            aooh.e(uriWithAppendedId, "withAppendedId(...)");
            abkpVar = new defpackage.abkp(new defpackage.abkh(uriWithAppendedId, null, z2, 6), string);
        } else {
            abkpVar = new defpackage.abkp(c(abwdVar) ? new defpackage.abjt(java.lang.Character.toUpperCase(abwdVar.c.charAt(0)), new defpackage.abjx(f)) : new defpackage.abkg((byte[]) null), string);
        }
        return abkpVar;
    }
}
