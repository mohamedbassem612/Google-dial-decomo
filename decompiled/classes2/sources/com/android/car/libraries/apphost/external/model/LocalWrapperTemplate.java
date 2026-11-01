package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class LocalWrapperTemplate implements defpackage.ze {
    private final defpackage.hhc holder;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalWrapperTemplate(defpackage.ze zeVar) {
        this();
        aooh.f(zeVar, "wrapped");
        this.holder.a = zeVar;
    }

    public final defpackage.ze getWrapped() {
        defpackage.ze zeVar = this.holder.a;
        aooh.c(zeVar);
        return zeVar;
    }

    private LocalWrapperTemplate() {
        this.holder = new defpackage.hhc();
    }
}
