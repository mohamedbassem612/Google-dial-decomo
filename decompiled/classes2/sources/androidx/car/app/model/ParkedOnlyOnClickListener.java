package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ParkedOnlyOnClickListener implements defpackage.xu {
    private final defpackage.xu mListener;

    private ParkedOnlyOnClickListener(defpackage.xu xuVar) {
        this.mListener = xuVar;
    }

    public static androidx.car.app.model.ParkedOnlyOnClickListener create(defpackage.xu xuVar) {
        return new androidx.car.app.model.ParkedOnlyOnClickListener((defpackage.xu) j$.util.Objects.requireNonNull(xuVar));
    }

    @Override // defpackage.xu
    public void onClick() {
        this.mListener.onClick();
    }
}
