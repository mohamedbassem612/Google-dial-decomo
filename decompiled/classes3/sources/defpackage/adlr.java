package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adlr extends java.lang.Exception {
    public adlr(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.lang.String str) {
        super("No unpacker available for " + packManifest.toString() + " scheme: " + str);
    }
}
