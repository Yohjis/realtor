package entity;

public class Type {
    {
        public class FlatType
        {
            public int FlatTypeID { get; set; }
        [StringLength(25)]
            public string Name { get; set; }
        [StringLength(60)]
            public string Information { get; set; }
            //определение связей в базе
            public ICollection<Flat> Flat { get; set; }
            public ICollection<WantedFlat> WantedFlat { get; set; }
        }
    }
}
