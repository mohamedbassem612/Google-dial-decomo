package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sos {
    private static final aimz a = aimz.i("com/android/dialer/phoneaccount/PhoneAccountComposer");

    public static final j$.util.Optional a(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            a.b().g(1, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/phoneaccount/PhoneAccountComposer", "compose", 16, "PhoneAccountComposer.kt").v("Empty component name");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        if (str2 == null || str2.length() == 0) {
            a.b().g(1, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/phoneaccount/PhoneAccountComposer", "compose", 20, "PhoneAccountComposer.kt").v("Empty phone account ID");
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            aooh.e(optionalEmpty2, "empty(...)");
            return optionalEmpty2;
        }
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
        if (componentNameUnflattenFromString != null) {
            j$.util.Optional optionalOf = j$.util.Optional.of(new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, str2));
            aooh.e(optionalOf, "of(...)");
            return optionalOf;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/phoneaccount/PhoneAccountComposer", "compose", 28, "PhoneAccountComposer.kt").v("Failed to parse the component name string");
        j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
        aooh.e(optionalEmpty3, "empty(...)");
        return optionalEmpty3;
    }
}
