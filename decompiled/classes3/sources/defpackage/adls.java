package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adls extends java.lang.Exception {
    public adls(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, java.lang.String str) {
        super("No validator available for " + packManifest.toString() + ", scheme: " + str);
    }
}
