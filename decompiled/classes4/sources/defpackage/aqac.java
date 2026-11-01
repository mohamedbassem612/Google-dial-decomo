package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@internal.org.jni_zero.JNINamespace("url::android")
public final class aqac {
    public static final android.icu.text.IDNA a;

    static {
        android.icu.text.IDNA uTS46Instance = android.icu.text.IDNA.getUTS46Instance(48);
        if (uTS46Instance == null) {
            throw new java.lang.IllegalStateException("Failed to create IDNA instance");
        }
        a = uTS46Instance;
    }
}
