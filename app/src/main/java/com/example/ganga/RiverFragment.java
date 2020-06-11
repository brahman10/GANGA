package com.example.ganga;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RiverFragment extends Fragment {

    private DatabaseReference ref;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.fragment_river,container,false);

        Button btnganga = view.findViewById(R.id.btnganga);
        Button btngomti = view.findViewById(R.id.btngomti);
        Button btnghag = view.findViewById(R.id.btnghag);
        Button btngandak = view.findViewById(R.id.btngandak);
        Button btnyam = view.findViewById(R.id.btnyam);
        Button btnson = view.findViewById(R.id.btnson);
        Button btnkosi = view.findViewById(R.id.btnkosi);
        Button btnpun = view.findViewById(R.id.btnpun);
        Button btnmaha = view.findViewById(R.id.btnmaha);
        Button btnramg = view.findViewById(R.id.btnramg);
        Button btntamsa = view.findViewById(R.id.btntamsa);
        ProgressBar progressBar=view.findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);


        btnganga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("GANGA");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="GANGA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btngomti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("GOMTI");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="GOMTI";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        btnghag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("GHAGHARA");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="GHAGHARA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btngandak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("GANDAK");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="GANDAK";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btnramg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("RAMGANGA");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="RAMGANGA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btnkosi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("KOSI");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="KOSI";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        btnmaha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("MAHANANDA");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="MAHANANDA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btnyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("Yamuna");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="YAMUNA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        btnson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("SON");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="SON";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        btnpun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("PUNPUN");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="PUNPUN";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        btntamsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref= FirebaseDatabase.getInstance().getReference().child("DATA").child("TAMSA");
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name="TAMSA";
                        String source = dataSnapshot.child("Source").getValue().toString();
                        String dest = dataSnapshot.child("Destination").getValue().toString();
                        String len = dataSnapshot.child("Length").getValue().toString();
                        String ar = dataSnapshot.child("Area").getValue().toString();
                        String city = dataSnapshot.child("Major Cities").getValue().toString();
                        String ghat = dataSnapshot.child("Major Ghats").getValue().toString();
                        Intent Nextpage=new Intent(getActivity(),RiverData.class);
                        Nextpage.putExtra("Name",name);
                        Nextpage.putExtra("Source",source);
                        Nextpage.putExtra("Destination",dest);
                        Nextpage.putExtra("Length",len);
                        Nextpage.putExtra("Area",ar);
                        Nextpage.putExtra("city",city);
                        Nextpage.putExtra("ghat",ghat);
                        startActivity(Nextpage);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(getActivity(),databaseError.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
        return view;

    }

}
