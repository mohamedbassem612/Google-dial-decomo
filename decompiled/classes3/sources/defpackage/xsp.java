package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xsp extends defpackage.xsn {
    public xsp(java.lang.Object obj, java.util.List list) {
        super("Found ModelLoaders for model class: " + java.lang.String.valueOf(list) + ", but none that handle this specific model instance: " + java.lang.String.valueOf(obj));
    }

    public xsp(java.lang.Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
    }

    public xsp(java.lang.Class cls, java.lang.Class cls2) {
        super(a.bK(cls2, cls, "Failed to find any ModelLoaders for model: ", " and data: "));
    }
}
