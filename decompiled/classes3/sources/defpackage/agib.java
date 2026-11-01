package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum agib {
    CONFIG_DEFAULT(defpackage.agfx.CONFIG_PROGRESS_ILLUSTRATION_DEFAULT),
    CONFIG_ACCOUNT(defpackage.agfx.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT),
    CONFIG_CONNECTION(defpackage.agfx.CONFIG_PROGRESS_ILLUSTRATION_CONNECTION),
    CONFIG_UPDATE(defpackage.agfx.CONFIG_PROGRESS_ILLUSTRATION_UPDATE);

    agib(defpackage.agfx agfxVar) {
        if (agfxVar.bU != 8) {
            throw new java.lang.IllegalArgumentException("Illustration progress only allow illustration resource");
        }
    }
}
